import pandas as pd
import mysql.connector
from mysql.connector import Error

# 读取 Excel 文件
df = pd.read_excel('weather_data_styled.xlsx')

# 打印列名以检查是否与SQL表一致
print(df.columns)
print(df.head())

# 去除日期中的星期信息并转换为标准日期格式
df['日期'] = pd.to_datetime(df['日期'].str.split().str[0])

try:
    # 创建数据库连接
    connection = mysql.connector.connect(
        host='localhost',
        database='weather_db',
        user='root',
        password='123456'
    )

    if connection.is_connected():
        cursor = connection.cursor()

        # 创建表
        create_table_query = '''
        CREATE TABLE IF NOT EXISTS weather (
            日期 DATE,
            天气 VARCHAR(255),
            最高温 VARCHAR(255),
            最低温 VARCHAR(255),
            风力风向 VARCHAR(255),
            空气质量指数 VARCHAR(255)
        )
        '''
        cursor.execute(create_table_query)
        connection.commit()

        # 插入数据
        insert_query = '''
        INSERT INTO weather (日期, 天气, 最高温, 最低温, 风力风向, 空气质量指数)
        VALUES (%s, %s, %s, %s, %s, %s)
        '''

        for row in df.itertuples(index=False):
            cursor.execute(insert_query, (row.日期, row.天气, row.最高温, row.最低温, row.风力风向, row.空气质量指数))

        connection.commit()

        print("数据已成功插入到数据库")

except Error as e:
    print(f"数据库连接或操作失败: {e}")

finally:
    # 确保 connection 已定义，并关闭连接
    try:
        if connection.is_connected():
            cursor.close()
            connection.close()
            print("数据库连接已关闭")
    except NameError:
        pass

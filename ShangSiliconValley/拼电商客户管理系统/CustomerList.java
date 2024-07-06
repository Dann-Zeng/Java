package pddsystem;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;


    public CustomerList(int totalCustomer) {
//        用途：构造器，用来初始化customers数组
//        参数：totalCustomer：指定customers数组的最大空间
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer newCustomer) {
//        用途：将参数customer添加组中最后一个客户对象记录之后
//        参数：customer指定要添加的客户对象
//        返回：添加成功返回true；false表示数组已满，无法添加
        if (total < customers.length) {
            customers[total] = newCustomer;
            total++;
            return true;
        }
        return false;
    }

    public boolean replaceCustomer(int index, Customer cust) {
//        用途：用参数customer替换数组中由index指定的对象
//        参数：customer指定替换的新客户对象
//        index指定所替换对象在数组中的位置，从0开始
//        返回：替换成功返回true；false表示索引无效，无法替换
        if (index >= 0 && index < total) {
            customers[index] = cust;
            return true;
        }
        return false;
    }

    public boolean deleteCustomer(int index) {
//        用途：从数组中删除参数index指定索引位置的客户对象记录
//        参数： index指定所删除对象在数组中的索引位置，从0开始
//        返回：删除成功返回true；false表示索引无效，无法删除
        if (index < 0 && index > total) {
            return false;
        }

        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[--total] = null;
        return true;
    }

    public Customer[] getAllCustomer() {
//        用途：返回数组中记录的所有客户对象
//        返回： Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同。
        Customer[] custs = new Customer[total];
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index) {
//        用途：返回参数index指定索引位置的客户对象记录
//        参数： index指定所要获取的客户在数组中的索引位置，从0开始
//        返回：封装了客户信息的Customer对象
        if (index < 0 || index > total) {
            return null;
        } else {
            return customers[index];
        }
    }

    public int getTotal() {
        return total;
    }
}

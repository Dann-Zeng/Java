package pddsystem;

public class CustomerView {
    CustomerList customerList = new CustomerList(10);

    public void enterMainMenu() {
//        用途：显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理
        boolean isFlag = true;

        while (isFlag) {
            System.out.println("-----------------拼电商客户管理系统-----------------");
            System.out.println("                  1 添 加 客 户");
            System.out.println("                  2 修 改 客 户");
            System.out.println("                  3 删 除 客 户");
            System.out.println("                  4 客 户 列 表");
            System.out.println("                  5 退      出");
            System.out.print("                  请选择(1-5)： ");

            char selection = CMUtility.readMenuSelection();
            switch (selection) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出(Y/N): ");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    break;
            }


        }
    }

    private void addNewCustomer() {
        System.out.println("----------添加客户----------");
        System.out.print("姓名: ");
        String name = CMUtility.readString(4);
        System.out.print("性别: ");
        char gender = CMUtility.readChar();
        System.out.print("年龄: ");
        int age = CMUtility.readInt();
        System.out.print("电话: ");
        String phoneNumber = CMUtility.readString(15);
        System.out.print("邮箱: ");
        String address = CMUtility.readString(15);

        Customer customer = new Customer(name, gender, age, phoneNumber, address);
        boolean flag = customerList.addCustomer(customer);
        if (flag) {
            System.out.println("-----添加成功-----");
        } else {
            System.out.println("-----位置已满,无法添加.-----");
        }
    }

    private void modifyCustomer() {
        System.out.println("-----修改用户-----");
        int index = 0;
        Customer customer = null;
        for (; ; ) {
            System.out.println("请选择待修改客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            customer = customerList.getCustomer(index - 1);
            if (customer == null) {
                System.out.println("无法找到该用户!!!");
            } else {
                break;
            }
        }

        System.out.print("姓名(" + customer.getName() + ")：");
        String name = CMUtility.readString(4, customer.getName());

        System.out.print("性别(" + customer.getGender() + ")：");
        char gender = CMUtility.readChar(customer.getGender());

        System.out.print("年龄(" + customer.getAge() + ")：");
        int age = CMUtility.readInt(customer.getAge());

        System.out.print("电话(" + customer.getPhone() + ")：");
        String phone = CMUtility.readString(15, customer.getPhone());

        System.out.print("邮箱(" + customer.getEmail() + ")：");
        String email = CMUtility.readString(15, customer.getEmail());

        customer = new Customer(name, gender, age, phone, email);
        boolean flag = customerList.replaceCustomer(index - 1, customer);
        if (flag) {
            System.out.println("修改成功");
        } else {
            System.out.println("索引无效，无法修改");
        }
    }

    private void deleteCustomer() {
        System.out.println("------删除用户------");
        int index = 0;
        Customer customer = null;
        for (; ; ) {
            System.out.println("请选择待删除客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            customer = customerList.getCustomer(index - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }
        System.out.println("确认是否删除(Y/N)：");
        char yon = CMUtility.readChar();
        if (yon == 'n') {
            return;
        }
        boolean flag = customerList.deleteCustomer(index -1);
        if (flag) {
            System.out.println("------删除成功------");
        } else {
            System.out.println("----------无法找到指定客户,删除失败--------------");
        }
    }

    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        Customer[] customers = customerList.getAllCustomer();
        if (customers.length == 0) {
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t\t邮箱");
            for (int i = 0; i < customers.length; i++) {
                System.out.println((i + 1) + customers[i].getDetails());
            }
        }

        System.out.println("-------------------------客户列表完成-------------------------");
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}


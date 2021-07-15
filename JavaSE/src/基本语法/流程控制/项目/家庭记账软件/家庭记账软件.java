package 基本语法.流程控制.项目.家庭记账软件;

public class 家庭记账软件 {
    public static void main(String[] args) {
        boolean isFlag = true;
        //用于记录用户的收入和支出的详情
        String details = " 收支\t账户金额\t\t收支金额\t说    明\n";
        double balance = 10000;//初始账户 金额
        while (isFlag){
            System.out.println("\n-----------------家庭收支记账软件-----------------\n");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退    出\n");
            System.out.print("                   请选择(1-4)：");
            //获取用户的选择 1-4
            char selection = Utility.readMenuSelection();

            switch (selection){
                case '1':
                    //System.out.println("显示详情");
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("---------------------------------------------");
                    break;
                case '2':
                    //System.out.println("收入情况");
                    System.out.print("本次收入金额：");
                    int money = Utility.readNumber();//从键盘获取收入的金额
                    
                    System.out.print("本次收入说明：");
                    String info = Utility.readString();//从键盘获取收入的说明
                    //处理details
                    balance += money;

                    details += ("收入\t\t" + balance + "\t\t" + money + "\t\t" + info + "\n");
                    System.out.println("---------------------登记完成-------------------");
                    break;
                case '3':
//                    System.out.println("支出情况");
                    System.out.print("本次支出金额：");
                    int money1 = Utility.readNumber();//从键盘获取支出的金额

                    System.out.print("本次支出说明：");
                    String desc1 = Utility.readString();//从键盘获取支出的说明

                    //根据获取的金额和支出说明修改用户的信息
                    if(balance >= money1){
                        balance -= money1;
                        details += ("支出\t\t" + balance + "\t\t" + money1 + "\t\t" +desc1 + "\n");
                        System.out.println("---------------------登记完成-------------------");
                    }else{
                        System.out.println("余额不足，支出失败");
                    }

                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit =  Utility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
//                    break;

            }

        }

    }
}

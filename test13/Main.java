package test13;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        User user = new User();
        register(user);
    }

    public static void register(User user0)
    {
        System.out.print("请输入用户名:");
        Scanner sc = new Scanner(System.in);
        user0.setUserName(sc.next());

        /*
         *  判断手机号码长度是否是11
         *  如果是11开始遍历pwd变量，判断每个字符是否在‘0’~‘9’之间
         *  如果有一个字符不在这个区间直接将format变量设置为false
         *  并且跳出for循环停止遍历，开始下一次while循环让用户重新输入密码
         */
        System.out.print("请输入手机号码:");
        String phoneNum = sc.next();
        boolean format;
        while (true)
        {
            format = false;
            if (phoneNum.length() == 11)
            {
                for (int i = 0; i < 11; i++)
                {
                    if (phoneNum.charAt(i)>='0' && phoneNum.charAt(i)<='9')
                    {
                        format = true;
                    }
                    else
                    {
                        format = false;
                        System.out.print("格式不正确请重新输入:");
                        phoneNum = sc.next();
                        break;
                    }
                }
            }
            else
            {
                System.out.print("格式不正确请重新输入:");
                phoneNum = sc.next();
                continue;
            }
            if (format == true)
            {
                user0.setPhoneNum(phoneNum);
                break;
            }
        }

        //密码采用两次判断原则
        while (true)
        {
            System.out.print("请输入密码:");
            String pwd = sc.next();
            System.out.print("请再次输入密码:");
            if (sc.next().equals(pwd))
            {
                user0.setPwd(pwd);
                break;
            }
            else
            {
                System.out.println("两次输入密码不一致");
                continue;
            }
        }

        //有限判断是否出现"@"
        System.out.print("请输入邮箱地址:");
        String email = sc.next();
        while (true)
        {
            if (email.indexOf("@") == -1)
            {
                System.out.print("邮箱地址错误请重新输入:");
                email = sc.next();
                continue;
            }
            else
            {
                user0.setEamil(email);
                break;
            }
        }
        System.out.println("用户创建成功！！！");
    }
}

package test13;

public class test
{
    public static void main(String[] args)
    {
        String s1 = "qwetyuuio";
        for (int i = 0; i < s1.length(); i++)
        {
            System.out.println(s1.charAt(i));
        }
        System.out.printf("s1长度:%d\n",s1.length());
        System.out.printf("s1中%s存在k\n",s1.indexOf("k") > -1?"存在":"不存在");
        System.out.printf("s1中%s存在u\n",s1.indexOf("u") > -1?"存在":"不存在");
        System.out.printf("s1中a第一次出现的索引在%d\n",s1.indexOf("a"));
        String s2 = "asdfqwetqweqwe";
        System.out.printf("s1与s2内容%s\n",s1.equals(s2)?"相同":"不相同");
        System.out.printf("s2最后一次出现q的索引是%d\n",s2.lastIndexOf("q"));
    }
}

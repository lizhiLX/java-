package test13;

public class User
{
    private String phoneNum;
    private String userName;
    private String eamil;
    private String pwd;

    public User()
    {

    }

    public User(String phoneNum, String userName, String eamil, String pwd)
    {
        this.phoneNum = phoneNum;
        this.userName = userName;
        this.eamil = eamil;
        this.pwd = pwd;
    }

    public String getPhoneNum()
    {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getEamil()
    {
        return eamil;
    }

    public void setEamil(String eamil)
    {
        this.eamil = eamil;
    }

    public String getPwd()
    {
        return pwd;
    }

    public void setPwd(String pwd)
    {
        this.pwd = pwd;
    }
}

package User;

public abstract class AUser implements User {

private String username;
private String password;

private Boolean admin;



    public AUser(String username,String password,Boolean admin) {
        this.password =password;
        this.username = username;
        this.admin = admin;

    }


   public void setUserName(String username){


   }

   public void setPassword(String password){

   }

  public String getUsername(){

        return username;
  }

   public String getPassword(){

        return password;
   }

   public void removeMoviesFromList(){


   }

    public void removeSeriesFromList(){


    }

    public void chooseMovie(){


    }

    public void chooseSeries(){


    }




}


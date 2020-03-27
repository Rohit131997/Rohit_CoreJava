package com.spring.serives;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.drivers.Database;

public class UserService {
	 @Autowired
	    @Qualifier("MySqlDriver")
	    private Database dataBase;

	    public String getDriverInfo11(){
	        return dataBase.getInfo();
	    }

		public String getDriverInfo() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getDriverInfo1() {
			// TODO Auto-generated method stub
			return null;
		}

}

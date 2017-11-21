package com.sast.bigdata.util;

import com.sast.bigdata.dao.IUserDAO;
import com.sast.bigdata.dao.impl.UserDAOImpl;
import com.sast.bigdata.model.UserInfo;

public class GenerateUserId {

//    public static int generateUserId(UserInfo user) {
//
//        int first = 0;
//        int second = 0;
//
//        switch (user.getDept()) {
//            case "八院科一":
//                first = 899;
//                break;
//            case "六院":
//                first = 600;
//                break;
//            default:
//                first = Integer.parseInt(user.getDept());
//                break;
//        }
//
//
//        switch (user.getStation()) {
//            case "总体":
//                second = 1;
//                break;
//            case "测发控":
//                second = 2;
//                break;
//            case "控制":
//                second = 3;
//                break;
//            case "增压输送":
//                second = 4;
//                break;
//            case "发动机":
//                second = 5;
//                break;
//            case "辅助动力":
//                second = 6;
//                break;
//            case "测量":
//                second = 7;
//                break;
//            default:
//                second = 0;
//                break;
//        }
//
//        IUserDAO iUserDAO = new UserDAOImpl();
//
//        int id = first * 100000 + second * 1000;
//
//        id = iUserDAO.getLatestUserId(id);
//
//        while (iUserDAO.isIdExist(id)) {
//            id += 1;
//        }
//
//        return id;
//    }
}

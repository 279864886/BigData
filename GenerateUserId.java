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
//            case "��Ժ��һ":
//                first = 899;
//                break;
//            case "��Ժ":
//                first = 600;
//                break;
//            default:
//                first = Integer.parseInt(user.getDept());
//                break;
//        }
//
//
//        switch (user.getStation()) {
//            case "����":
//                second = 1;
//                break;
//            case "�ⷢ��":
//                second = 2;
//                break;
//            case "����":
//                second = 3;
//                break;
//            case "��ѹ����":
//                second = 4;
//                break;
//            case "������":
//                second = 5;
//                break;
//            case "��������":
//                second = 6;
//                break;
//            case "����":
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

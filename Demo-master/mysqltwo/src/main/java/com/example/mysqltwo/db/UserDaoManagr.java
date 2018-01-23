package com.example.mysqltwo.db;

import android.util.Log;

import com.example.mysqltwo.User;
import com.example.mysqltwo.dbutils.DaoManager;
import com.example.mysqltwo.dbutils.IDao;
import com.greendao.DaoSession;
import com.greendao.UserDao;

import java.net.IDN;
import java.util.List;

/**
 * Created by Administrator on 2018/1/5.
 */

public class UserDaoManagr implements IDao<User> {

    private DaoSession mDaoSession = DaoManager.getInstance().getDaoSession();
    @Override
    public boolean insert(User user) {
        return mDaoSession.getUserDao()
                .insert(user) > 0 ? true : false;
    }

    //删除
    @Override
    public boolean delete(User user) {
        try {
            mDaoSession.getUserDao()
                    .delete(user);
        } catch (Exception e) {
            Log.e("lxq", "删除失败");
            return false;
        }
        return true;
    }

    //修改·
    @Override
    public boolean update(User user) {
        try {
            mDaoSession.getUserDao()
                    .update(user);
        } catch (Exception e) {
            Log.e("lxq", "更新失败");
            return false;
        }
        return true;
    }

    //查询全部
    @Override
    public List<User> queryAll() {
        return mDaoSession.getUserDao()
                .loadAll();
    }

    //通过id查询
    @Override
    public User queryById(long id) {
        return mDaoSession.getUserDao()
                .loadByRowId(id);
    }

    @Override
    public List<User> queryByObj(String where, String... params) {
        return mDaoSession.getUserDao()
                .queryRaw(where, params);
    }

    //通过名字查询
    public User queryByName(String name) {
        return mDaoSession.getUserDao()
                .queryBuilder()
                .where(UserDao.Properties.Name.eq(name))
                .build()
                .unique();
    }
}

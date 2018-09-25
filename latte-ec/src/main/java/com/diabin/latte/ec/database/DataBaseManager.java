package com.diabin.latte.ec.database;

import android.content.Context;

import org.greenrobot.greendao.database.Database;

/**
 * Created by 黄陈聪 on 2018/9/25.
 */
public class DataBaseManager {

    private DaoSession mDaoSession = null;
    private UserProfileDao mDao = null;

    private DataBaseManager() {

    }

    public DataBaseManager init(Context context) {
        initDao(context);
        return this;
    }

    private final static class Holder {
        private final static DataBaseManager INSTANCE = new DataBaseManager();
    }

    public static DataBaseManager getInstance() {
        return Holder.INSTANCE;
    }

    private void initDao(Context context) {
        final ReleaseOpenHelper helper = new ReleaseOpenHelper(context, "fast_ec.db");
        final Database db = helper.getWritableDb();
        mDaoSession = new DaoMaster(db).newSession();
        mDao = mDaoSession.getUserProfileDao();
    }

    public final UserProfileDao getDao() {
        return mDao;
    }
}

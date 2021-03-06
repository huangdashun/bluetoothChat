package huangshun.it.com.btproject.Model;

import android.os.Handler;

/**
 * Created by hs on 2017/3/22.
 */
public class Task {
    public static final int TASK_START_ACCEPT = 1;
    public static final int TASK_START_CONN_THREAD = 2;
    public static final int TASK_SEND_MSG = 3;
    public static final int TASK_GET_REMOTE_STATE = 4;
    public static final int TASK_RECV_MSG = 5;
    public static final int TASK_SEND_MSG_FAIL = -1;

    // 任务ID
    private int mTaskID;
    // 任务参数列表
    public Object[] mParams;

    private Handler mH;


    public Task(Handler handler, int taskID, Object[] params) {
        this.mH = handler;
        this.mTaskID = taskID;
        this.mParams = params;
    }

    public Handler getHandler() {
        return this.mH;
    }

    public int getTaskID() {
        return mTaskID;
    }
}

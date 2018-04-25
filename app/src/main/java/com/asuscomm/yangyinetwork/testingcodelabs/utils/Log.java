package com.asuscomm.yangyinetwork.testingcodelabs.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Environment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Locale;


/**
 * The Class Log.
 */
public class Log {
    public static final String LOG_TAG_THROWABLE = "Throwable";

    private static final int REAL_METHOD_POS = 2;
    private static final String TAB = "\t";
    private static final String NEWLINE = "\r\n";
    private static final String mLogPath = Environment.getExternalStorageDirectory().getAbsolutePath()
            + File.separatorChar + "Android" + File.separatorChar + "data"
            + File.separatorChar + "kr.co.mtcom.horn" + File.separatorChar + "files"
            + File.separatorChar + "Data" + File.separatorChar + "log";

    /**
     * Log 가 저장되는 Directory Path 반환.
     *
     * @return the log dir path
     */
    public static String getLogDirPath() {
        return mLogPath;
    }

    /**
     * Gets the prefix.
     *
     * @return the prefix
     */
    private static String getPrefix() {
        StringBuilder sb = new StringBuilder(1024);

        try {
            StackTraceElement[] ste = new Throwable().getStackTrace();
            StackTraceElement realMethod = ste[REAL_METHOD_POS];

            sb.append("[");
            sb.append(realMethod.getFileName());
            sb.append(":");
            sb.append(realMethod.getLineNumber());
            sb.append(":");
            sb.append(realMethod.getMethodName());
            sb.append("()] ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    /**
     * Gets the file name.
     *
     * @return the file name
     */
    private static String getFileName() {
        StackTraceElement[] ste = new Throwable().getStackTrace();
        StackTraceElement realMethod = ste[REAL_METHOD_POS];

        String fileName = realMethod.getFileName();

        return fileName.substring(0, fileName.lastIndexOf("."));
    }


    public static void d() {
        android.util.Log.d(getFileName(), getPrefix());
    }

    /**
     * D.
     *
     * @param msg the msg
     */
    public static void d(String msg) {
        android.util.Log.d(getFileName(), getPrefix() + msg);
    }
}

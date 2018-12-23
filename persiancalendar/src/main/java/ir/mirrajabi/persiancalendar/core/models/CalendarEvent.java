package ir.mirrajabi.persiancalendar.core.models;

/**
 * CalendarEvent
 *
 * @author ebraminio
 */
public class CalendarEvent {
    private PersianDate mDate;
    private String mTitle;
    private boolean mHoliday;
    private String mPath;

    public CalendarEvent(PersianDate date, String title, boolean holiday) {
        this.mDate = date;
        this.mTitle = title;
        this.mHoliday = holiday;
    }

    public CalendarEvent(PersianDate date, String title, boolean holiday, String path) {
        this.mDate = date;
        this.mTitle = title;
        this.mHoliday = holiday;
        this.mPath = path;
    }

    public PersianDate getDate() {
        return mDate;
    }

    public void setDate(PersianDate date) {
        this.mDate = date;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public boolean isHoliday() {
        return mHoliday;
    }

    public void setHoliday(boolean holiday) {
        this.mHoliday = holiday;
    }

    public String getPath() {
        return mPath;
    }

    public void setPath(String mPath) {
        this.mPath = mPath;
    }
}
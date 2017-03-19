/**
 * Created by 오현택 on 2017-03-19.
 */
public class Activity {
    private int contentView;
    public void setContentView(int resId){
        this.contentView = resId;
    }
    public  View findViewById(int resId){
        return new TextView();
    }
    protected void  onCreated() {

    }
    protected void  onStop() {

    }
    protected void  onStart() {

    }
    protected void  onReStart() {

    }
    protected void  onDestroy(){

    }
    protected void  onPause() {

    }
}

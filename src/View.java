/**
 * Created by 오현택 on 2017-03-19.
 */
public class View  {
    private OnClickListener onClickListener;

    public void  setOnClickListener(OnClickListener listener){
        this.OnClickListener = listener;
    }
    public void setOnClick(boolean is){
        if(onClickListener !=  null && is) onClickListener.onClcik(this);
    }
    public interface OnClickListener(){
        void onClick(View v);
    }
}

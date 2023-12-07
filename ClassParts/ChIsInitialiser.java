package ChJavaBaseLibrary.ClassParts;

public class ChIsInitialiser
{
    private boolean InitFlg = false;
    
    public boolean IsInit(){return InitFlg;}

    protected void SetInitFlg(boolean _Flg){InitFlg =_Flg;}

}
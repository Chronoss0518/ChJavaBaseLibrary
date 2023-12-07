package ChJavaBaseLibrary.Plugins;

import java.util.ArrayList;
import java.util.List;
import ChJavaBaseLibrary.ClassParts.*;

public class ChPluginManager extends ChIsInitialiser
{

    ///////////////////////////////////////////////////////////////////////////////////
    //Initializ3AndRelease//

    public void Init(int _MaxPlugins)
    {
        if(IsInit())return;
        MaxPlugins = _MaxPlugins;
        Plugins = new ArrayList<ChBasePlugin>();
        SetInitFlg(true);
    }

    public void Release()
    {
        Plugins.clear();
    }

    ///////////////////////////////////////////////////////////////////////////////////
    //Setter//
    
    public void SetPlugins(ChBasePlugin _Plugins)
    {
        if(!IsInit())return;
        if(MaxPlugins >= Plugins.size())return;

        if(_Plugins == null)
        {
            return;
        }
        
        Plugins.add(_Plugins);
    }

    public void SetMaxPlugins(int _Count)
    {
        if(!IsInit())return;
        MaxPlugins = _Count;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    //Getter//

    ///////////////////////////////////////////////////////////////////////////////////
    //UpdateFunction//

    public void Update()
    {
        if(!IsInit())return;
        for(int i = 0; i< Plugins.size();i++)
        {
            Plugins.get(i).Update();
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////
    //SingleTon Getter//
    public static ChPluginManager GetIns()
    {
        if(Ins == null)
        {
            Ins = new ChPluginManager();
        }
        return Ins;
    }
    ///////////////////////////////////////////////////////////////////////////////////

    static private ChPluginManager Ins;

    private List<ChBasePlugin> Plugins;

    private int MaxPlugins = 0;

    private ChPluginManager()
    {
        Ins = null;
        MaxPlugins = 0;
    }

}

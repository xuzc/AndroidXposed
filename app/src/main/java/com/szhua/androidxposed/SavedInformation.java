package com.szhua.androidxposed;

/**
 * Created by szhua on 2016/12/5.
 *
 * Save cancled information !!
 *
 */
public class SavedInformation {

    /**
     *  findAndHookMethod("com.tencent.mm.ui.LauncherUI", loadPackageParam.classLoader, "onResume", new XC_MethodHook() {
    @Override
    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
    try {
    XposedBridge.log("start hook!") ;
    Activity context = (Activity) param.thisObject;
    Toast.makeText(context,"AndroidXposedTest",Toast.LENGTH_SHORT).show();

    }catch (Exception e){
    Log.e("leilei","this is why you are erro:"+e.toString()) ;
    }
    }
    @Override
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
    }
    });
     XposedHelpers.findAndHookMethod("com.tencent.mm.ui.LauncherUI", loadPackageParam.classLoader, "onCreate", Bundle.class , new XC_MethodHook() {
    @Override
    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
    }
    @Override
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
    Context context = (Context) param.thisObject;
    Intent intent = new Intent();
    ComponentName name = new ComponentName("com.szhua.androidxposed"
    ,"com.szhua.androidxposed.AdActivity");
    intent.setComponent(name);
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK) ;
    context.startActivity(intent);
    }
    });
     */

    // TODO: 2016/12/7
    /**
     *   try{
     Class storageM =  XposedHelpers.findClass("com.tencent.mm.storage.m",clsLoader);
     XposedHelpers.findAndHookConstructor(storageM, String.class, new XC_MethodHook() {
    @Override
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
    XposedBridge.log("M constructure:"+param.args[0].toString());
    }
    }) ;

     }catch (Exception e){
     XposedBridge.log("M constructure erro!!!");
     }



     findAndHookMethod(Constant.Class_ConactInfoUI, clsLoader, "wv",String.class, new XC_MethodHook() {
    @Override
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
    String params = (String) param.args[0];
    XposedBridge.log("wv:"+params);
    }
    }) ;



     //public final void a(int paramInt, com.tencent.mm.sdk.h.j paramj, Object paramObject)


     findAndHookMethod(Constant.Class_ConactInfoUI, clsLoader, "a",int.class,"com.tencent.mm.sdk.h.j",Object.class, new XC_MethodHook() {
    @Override
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
    if(param.args[2] instanceof String) {
    String params = (String) param.args[2];
    XposedBridge.log("a(int,j,Obkject):" + params);
    }else{
    XposedBridge.log("a(int,j,Obkject):unkhnowed method!");
    }
    }
    }) ;

     //public final void a(final String paramString, com.tencent.mm.sdk.h.i parami)
     findAndHookMethod(Constant.Class_ConactInfoUI, clsLoader, "a",String.class,"com.tencent.mm.sdk.h.i", new XC_MethodHook() {
    @Override
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
    if(param.args[0] instanceof String) {
    String params = (String) param.args[0];
    XposedBridge.log("a(String,i):" + params);
    }else{
    XposedBridge.log("a(String,i):unkhnowed method!");
    }
    }
    }) ;

     //protected final String atw()

     findAndHookMethod(Constant.Class_ConactInfoUI, clsLoader, "atw", new XC_MethodHook() {
    @Override
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
    String result = (String) param.getResult();
    XposedBridge.log("atw():"+result);
    }
    }) ;
     */
    // TODO: 2016/12/7
    /**
     * //                        Object currentObject = param.thisObject;
     //                        for (Method field : currentObject.getClass().getDeclaredMethods()) { //遍历类成员
     //                             field.setAccessible(true);
     //                             XposedBridge.log(field.getName()+"paramType:"+field.getParameterTypes()+"returnType:"+field.getReturnType());
     //                        }
     */


    // TODO: 2017/1/3
//            int a = intent.getIntExtra("Contact_Scene", 9);
//        String b  = intent.getStringExtra("Verify_ticket");
//        boolean c= intent.getBooleanExtra("Chat_Readonly", false);
//        boolean d = intent.getBooleanExtra("User_Verify", false);
//        String f= intent.getStringExtra("Contact_ChatRoomId");
//        String g= intent.getStringExtra("Contact_User");
//       String i =intent.getStringExtra("Contact_Encryptusername");
//            String l= intent.getStringExtra("Contact_Province");
//        String m = intent.getStringExtra("Contact_City");
//        String n = intent.getStringExtra("Contact_Signature");
//        int o = intent.getIntExtra("Contact_VUser_Info_Flag", 0);
//        String p = intent.getStringExtra("Contact_VUser_Info");
//        String q = intent.getStringExtra("Contact_Distance");
//        int r = intent.getIntExtra("Contact_KWeibo_flag", 0);
//        String s = intent.getStringExtra("Contact_KWeibo");
//        String t = intent.getStringExtra("Contact_KWeiboNick");
//        String u = intent.getStringExtra("Contact_KFacebookName");
//        long v = intent.getLongExtra("Contact_KFacebookId", 0L);
//        String  w = intent.getStringExtra("Contact_BrandIconURL");
//        String x= intent.getStringExtra("Contact_RegionCode");
//        byte[]  y = intent.getByteArrayExtra("Contact_customInfo");
//        boolean z = intent.getBooleanExtra("force_get_contact", false);
//      String a1 =intent.getStringExtra("Contact_PyInitial");
//
//            String a3 =intent.getStringExtra("Contact_Search_Mobile");
//        String a4 =intent.getStringExtra("Contact_Search_Mobile") ;

//    // TODO: 2017/1/3
//    /*从联系人详情页面的控件中找信息 from listview to get infos */
//    private void hookDexMethod_getContactInfoUIinfo(final ClassLoader clsLoader) throws XposedHelpers.ClassNotFoundError {
//        findAndHookMethod(
//                Class_ConactInfoUI,
//                clsLoader, Method_onPause , new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param)
//                            throws Throwable {
//                        Object currentObject = param.thisObject;
//                        //获得ContactInfoUI的父类；并且拿到控件中的数据；
//                        Class mmpreference =XposedHelpers.findClass(Class_MMPreference,clsLoader);
//                        for (Field field : mmpreference.getDeclaredFields()) { //遍历类成员
//                            //setAccessible能够获得number；
//                            field.setAccessible(true);
//                            if((field.getName()).equals(MMFRAME_LISTVIEW))
//                            {
//                                ListView listview = (ListView) field.get(currentObject);
//                                if(listview!=null){
//                                    XposedBridge.log("we get listview suceess!");
//                                    contactInfoUITextViews.clear();
//                                    //contactsInfoUIIMageViews.clear();
//
//  /*使用stringBuilder 虽然性能差点，但是线程安全*/
//                                    StringBuffer stringBuffer =null ;
//                                    getTextViewFromViewGroup(listview);
//
//                                    for (TextView textView : contactInfoUITextViews) {
//                                        if(!TextUtils.isEmpty(textView.getText().toString())){
//
//                                            if(stringBuffer==null){
//                                                stringBuffer=new StringBuffer();
//                                            }
//                                            int textViewId =textView.getId();
//                                            if(textViewId==ContactUI_ID_UserName){
//                                                stringBuffer.append("用户显示名称：").append(textView.getText().toString()).append("\n");
//                                            }else if(textViewId==ContactUI_ID_Area){
//                                                stringBuffer.append("用户的地区：").append(textView.getText().toString()).append("\n");
//                                            }else  if(textViewId==ContactUI_ID_Distance||textViewId==ContactUI_ID_WECHAT_NUM){
//                                                stringBuffer.append("用户的微信号或者距离：").append(textView.getText().toString()).append("\n");
//                                            }else  if (textViewId==ContactUI_ID_Labels){
//                                                stringBuffer.append("标签：").append(textView.getText().toString()).append("\n");
//                                            }else  if (textViewId==ContactUI_ID_NickName){
//                                                stringBuffer.append("微信昵称：").append(textView.getText().toString()).append("\n");
//                                            }else  if (textViewId==ContactUI_ID_SigNature){
//                                                stringBuffer.append("个性签名：").append(textView.getText().toString()).append("\n");
//                                            }
//                                            XposedBridge.log(textView.getText().toString());
//                                        }
//                                    }
//
////                                        try{
////                                            //send message to receiver ;
//////                                            Intent intent =new Intent();
//////                                            intent.putExtra(com.szhua.androidxposed.Constant.IntentExtendedStringName,stringBuffer.toString());
//////                                            intent.setAction(com.szhua.androidxposed.Constant.Receiver_Action);
//////                                            ((Context)currentObject).sendBroadcast(intent);
////                                        }catch (ClassCastException e){
////                                          Logger.e("the currentObject can not cast to Context !!");
////                                        }
//                                }
//                            }
//                        }
//                    }
//                });
//    }
}

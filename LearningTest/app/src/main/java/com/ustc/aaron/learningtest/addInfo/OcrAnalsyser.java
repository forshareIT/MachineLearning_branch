package com.ustc.aaron.learningtest.addInfo;

import android.text.TextUtils;

import com.ustc.aaron.learningtest.addInfo.contract.LanguageCodes;
import com.ustc.aaron.learningtest.addInfo.contract.Line;
import com.ustc.aaron.learningtest.addInfo.contract.OCR;
import com.ustc.aaron.learningtest.addInfo.contract.Word;
import com.ustc.aaron.learningtest.addInfo.contract.Region;
import com.ustc.aaron.learningtest.base.BaseActivity;

import java.util.ArrayList;

/**
 * Created by wangyan-pd on 2016/11/19.
 */

public class OcrAnalsyser {
    //别人的 00b0e581e4124a2583ea7dba57aaf281
    // 我自己的 56c87e179c084cfaae9b70a2f58fa8d3 56c87e179c084cfaae9b70a2f58fa8d3
    //彭露的 9e88939475894dec85a2019fd36243be
    //进发的 eac11887004a4c88a7c3f527d6852bb3
    //王岩2 cc750e4c195d497391e9fe18f6d21bae
    static ArrayList<String> keys;

    static {
        keys = new ArrayList<>();
        keys.add("9e88939475894dec85a2019fd36243be");
        keys.add("56c87e179c084cfaae9b70a2f58fa8d3");
        keys.add("eac11887004a4c88a7c3f527d6852bb3");
        keys.add("cc750e4c195d497391e9fe18f6d21bae");
        keys.add("ca5041c264f04f2e8c09f789ac19dbf1");
        keys.add("2a681f188c9c43b3a6581f0b3d4e5de7");
        keys.add("00b0e581e4124a2583ea7dba57aaf281");
    }

    //String[] keys = { "9e88939475894dec85a2019fd36243be", "56c87e179c084cfaae9b70a2f58fa8d3"};
    int currentIndex = 0;
    private static OcrAnalsyser instance = new OcrAnalsyser();
    private String img_path;

    private boolean verticalOrentation = true;


    private byte[] img;
    private String seachPicPath;

    public static OcrAnalsyser getInstance() {
        return instance;
    }

    public void uploadImage(BaseActivity activity, String fileName, ImageUploadCallBack callback) {

    }

    public interface ImageUploadCallBack {
        void onSucess(ImageUpload imageUpload);

        void onFail(Throwable throwable);
    }
    public interface CallBack {
        void onSucess(OCR ocr);

        void onFail(Throwable throwable);
    }

    public void analyse(BaseActivity activity, String img_path, boolean isVertical, CallBack callback) {
//        TextRecognizer textRecognizer = new TextRecognizer.Builder(context).build();

    }

//    public void analyse(byte[] img, CallBack callback) {
//        if (callback == null)
//            return;
//        this.img = img;
//        try {
//            Observable.create(mOnSubscrube1)
//                    .subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .subscribe(s -> callback.onSucess(s),
//                            throwable -> callback.onFail(throwable));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    public String getPasedMiscSoftText(OCR ocr) {

        String result = "";
        for (Region reg : ocr.regions) {
            for (Line line : reg.lines) {
                for (Word word : line.words) {
                    result += word.text + " ";
                }
                result += "\n";
            }
            result += "\n\n";
        }
        if (ocr.language.equalsIgnoreCase(LanguageCodes.ChineseSimplified) || ocr.language.equalsIgnoreCase(LanguageCodes.ChineseTraditional)) {
            result = result.replaceAll(" ", "");
        }
        if (TextUtils.isEmpty(result))
            result = "no text found";
        return result;
    }

}

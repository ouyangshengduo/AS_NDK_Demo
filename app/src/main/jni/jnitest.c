#include "edan_com_as_ndk_demo_ndktest_NdkJniUtils.h"
/*
 * Class:     com_example_edu_ndktest_NdkJniUtils
 * Method:    getCLanguageString
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_edan_com_as_1ndk_1demo_ndktest_NdkJniUtils_getCLanguageString
  (JNIEnv *env, jobject obj){
     return (*env)->NewStringUTF(env,"My name is Ouyangshengduo,Hi!");
  }
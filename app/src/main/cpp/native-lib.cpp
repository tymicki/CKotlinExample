#include <jni.h>
#include <string>
#include <cmath>

extern "C"
JNIEXPORT jstring JNICALL Java_com_jtym_ckotlin_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "JT";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT jboolean JNICALL Java_com_jtym_ckotlin_MainActivity_booleanFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    return false;
}

extern "C"
JNIEXPORT jbyte JNICALL Java_com_jtym_ckotlin_MainActivity_byteFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    char c = 'A';
    return c;
}

extern "C"
JNIEXPORT jchar JNICALL Java_com_jtym_ckotlin_MainActivity_charFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    char c = 'A';
    return c;
}

extern "C"
JNIEXPORT jshort JNICALL Java_com_jtym_ckotlin_MainActivity_shortFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    short s = pow(2, 15) - 1;
    return s;
}

extern "C"
JNIEXPORT jint JNICALL Java_com_jtym_ckotlin_MainActivity_intFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    short i = pow(2, 15) - 1;
    return i;
}

extern "C"
JNIEXPORT jlong JNICALL Java_com_jtym_ckotlin_MainActivity_longFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    long l = pow(2, 31) - 1;
    return l;
}

extern "C"
JNIEXPORT jfloat JNICALL Java_com_jtym_ckotlin_MainActivity_floatFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    float f = 3.999999f;
    return f;
}

extern "C"
JNIEXPORT jdouble JNICALL Java_com_jtym_ckotlin_MainActivity_doubleFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    double d = 3.99999999;
    return d;
}
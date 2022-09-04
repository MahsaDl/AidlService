// IComman.aidl
package com.example.aidlserver;

// Declare any non-default types here with import statements

interface IComman {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void resetLockout(byte bArr);
                                 int getAuthenticatorId();
                                 int revokeChallenge() ;
                                 long generateChallenge(int i);
                                 int getFeatureCount();
                                 int enumerate();
                                 void remove(int i);
                                 void authenticate(long j);
                                 void cancel();
                                 void enroll(byte bArr, int i, int iArr);
                                 void setCallback(int faceServiceReceiver);
                                 void setFeature(int i, boolean z, byte bArr, int i2);
                                 boolean getFeature(int i, int i2);
}
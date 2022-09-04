package com.example.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.os.IResultReceiver;

import androidx.annotation.Nullable;

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public class Ab extends IComman.Stub{
        @Override
        public void resetLockout(byte bArr) throws RemoteException {

        }

        @Override
        public int getAuthenticatorId() throws RemoteException {
            return 0;
        }

        @Override
        public int revokeChallenge() throws RemoteException {
            return 0;
        }

        @Override
        public long generateChallenge(int i) throws RemoteException {
            return 0;
        }

        @Override
        public int getFeatureCount() throws RemoteException {
            return 0;
        }

        @Override
        public int enumerate() throws RemoteException {
            return 0;
        }

        @Override
        public void remove(int i) throws RemoteException {

        }

        @Override
        public void authenticate(long j) throws RemoteException {

        }

        @Override
        public void cancel() throws RemoteException {

        }

        @Override
        public void enroll(byte bArr, int i, int iArr) throws RemoteException {

        }

        @Override
        public void setCallback(int faceServiceReceiver) throws RemoteException {

        }

        @Override
        public void setFeature(int i, boolean z, byte bArr, int i2) throws RemoteException {

        }

        @Override
        public boolean getFeature(int i, int i2) throws RemoteException {
            return false;
        }
    }

}
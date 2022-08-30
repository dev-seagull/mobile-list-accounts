package com.example.listofaccounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Intent;

import java.util.ArrayList;

public class GetAllAccounts{
    public static ArrayList<String> getAccountsOfDevice(String type , Activity activity){
        Intent intent = AccountManager.newChooseAccountIntent(null, null, new String[]{type},
                false, null, null, null, null);
        activity.startActivityForResult(intent, 23);


        AccountManager accountManager = AccountManager.get(activity.getApplicationContext());
        Account[] accounts = accountManager.getAccountsByType(type);
        ArrayList<String> listOfAccounts = new ArrayList<>();

        for(Account account: accounts){
            listOfAccounts.add(account.toString());
        }

        return listOfAccounts;
    }
}

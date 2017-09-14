package com.xzh.barcode.base;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView();
		findViewById();
		controll();
	}

	protected abstract void setContentView();

	protected abstract void findViewById();

	protected abstract void controll();

}

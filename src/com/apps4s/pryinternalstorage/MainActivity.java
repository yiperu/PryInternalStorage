package com.apps4s.pryinternalstorage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//createInternalStorage();
		readInternalStorage();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	// Creamos la funcion que creara y guardara datos
	private void createInternalStorage(){
		try {
			OutputStreamWriter osw = new OutputStreamWriter(openFileOutput("elArchivo.txt",0));
			osw.write("Contenido de Prueva");
			osw.flush();
			osw.close();
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
	// Crearemos la funcion que nos permite leer los datos guardados:
	private void readInternalStorage(){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(openFileInput("elArchivo.txt")));
			String str = br.readLine();
			System.out.println(str);
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
}

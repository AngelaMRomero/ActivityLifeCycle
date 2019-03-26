/**
 *
 * Applications development for mobile devices
 * -------------------------------------------
 *
 * The StateTestActivity program implements a simply activity without
 * GUI that prints in console the current status according to activity
 * lifecycle events.
 *
 * @author Francisco Martinez
 *
 * This example is based on the source code from the book
 * of Reto Meier and Ian Lake - Professional Android
 * licensed under the Apache License, Version 2.0 (the "License"):
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 */

package aplimovil.com.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

public class StateTestActivity extends AppCompatActivity {
    // Called at the start of the full lifetime.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Initialize activity.
        System.out.println("OnCreate");
    }

    // Called after onCreate has finished, use to restore UI state
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        System.out.println("OnRestoreInstanceState");
    }

    // Called before subsequent visible lifetimes
    // for an activity process.
    @Override
    public void onRestart() {
        super.onRestart();
        // Load changes knowing that the activity has already
        // been visible within this process.
        System.out.println("OnRestart");
    }

    // Called at the start of the visible lifetime.
    @Override
    public void onStart() {
        super.onStart();
        // Apply any required UI change now that the Activity is visible.
        System.out.println("OnStart");
    }

    // Called at the start of the active lifetime.
    @Override
    public void onResume() {
        super.onResume();
        // Resume any paused UI updates, threads, or processes required
        // by the activity but suspended when it was inactive.
        System.out.println("OnResume");
    }

    // Called to save UI state changes at the
    // end of the active lifecycle.
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.
        super.onSaveInstanceState(savedInstanceState);
        System.out.println("OnSaveInstanceState");
    }

    // Called at the end of the active lifetime.
    @Override
    public void onPause() {
        // Suspend UI updates, threads, or CPU intensive processes
        // that don�t need to be updated when the Activity isn�t
        // the active foreground activity.
        super.onPause();
        System.out.println("OnPause");
    }

    // Called at the end of the visible lifetime.
    @Override
    public void onStop() {
        // Suspend remaining UI updates, threads, or processing
        // that aren�t required when the Activity isn�t visible.
        // Persist all edits or state changes
        // as after this call the process is likely to be killed.
        super.onStop();
        System.out.println("OnStop");
    }

    // Called at the end of the full lifetime.
    @Override
    public void onDestroy() {
        // Clean up any resources including ending threads,
        // closing database connections etc.
        super.onDestroy();
        System.out.println("OnDestroy");
    }

}


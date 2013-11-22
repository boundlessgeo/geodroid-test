# GeoDroid Tests

Test application for Geodroid project.

## Setting up the Android SDK

See the [GeoDroid README](https://github.com/boundlessgeo/geodroid) for 
instructions on setting up the Android SDK tools.

## Setup

Start by cloning the GeoDroid repository.

    git clone git://github.com/boundlessgeo/geodroid.git

Next clone the [JUnit4Android](https://github.com/dthommes/JUnit4Android) 
repository.

    git clone git://github.com/dthommes/JUnit4Android.git

Next clone this repository.

    git clone git://github.com/boundlessgeo/geodroid-test.git

Finally change directory to the `geodroid-test` checkout and update the project.

    cd geodroid-test
    android update project -s -t android-15 -p .

Note: Replace "android-15" with the target you wish to test against.

## Testing

Tests must be run from Eclipse using the [Android Development Tools](http://developer.android.com/tools/sdk/eclipse-adt.html) (ADT) plugin. 

Once Eclipse is setup import the above three projects into Eclipse and run 
the `geodroid-test` project as an Android application.

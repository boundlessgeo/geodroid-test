package org.jeo.geopkg;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.geodroid.test.GeodroidTestApp;
import org.jeo.Tests;
import org.jeo.android.geopkg.GeoPackage;
import org.jeo.android.geopkg.GeoPkgWorkspace;
import org.jeo.util.Pair;

import android.os.Environment;

public class GeoPkgTests {

    public static Pair<GeoPkgWorkspace, File> open(int r, String name) throws IOException {
        File tmpdir = File.createTempFile("gpkg", "data", Environment.getExternalStorageDirectory());
        tmpdir.delete();
        tmpdir.mkdir();

        InputStream in = GeodroidTestApp.getContext().getResources().openRawResource(r);
        Tests.unzip(in, tmpdir);

        GeoPkgWorkspace gpkg = GeoPackage.open(new File(tmpdir, name));
        return Pair.of(gpkg, tmpdir);
    }
}

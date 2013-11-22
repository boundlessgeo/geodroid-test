package org.jeo.geopkg;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.geodroid.test.GeodroidTestApp;
import org.geodroid.tests.R;
import org.jeo.Tests;
import org.jeo.android.geopkg.GeoPackage;
import org.jeo.android.geopkg.GeoPkgWorkspace;
import org.jeo.data.VectorApiTestBase;
import org.jeo.data.VectorDataset;
import org.junit.After;

import android.os.Environment;

public class GeoPkgTest extends VectorApiTestBase {

    File tmpdir;
    VectorDataset data;

    protected VectorDataset createVectorData() throws Exception {
        tmpdir = File.createTempFile("gpkg", "data", Environment.getExternalStorageDirectory());
        tmpdir.delete();
        tmpdir.mkdir();

        InputStream in = GeodroidTestApp.getContext().getResources().openRawResource(R.raw.usa);
        Tests.unzip(in, tmpdir);

        GeoPkgWorkspace gpkg = GeoPackage.open(new File(tmpdir, "usa.gpkg"));
        return (VectorDataset) gpkg.get("states");
    }

    @After
    public void tearDown() throws IOException {
        FileUtils.deleteDirectory(tmpdir);
    }
}

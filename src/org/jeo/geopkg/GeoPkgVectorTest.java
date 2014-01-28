package org.jeo.geopkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.geodroid.tests.R;
import org.jeo.android.geopkg.GeoPkgWorkspace;
import org.jeo.data.VectorApiTestBase;
import org.jeo.data.VectorDataset;
import org.jeo.util.Pair;
import org.junit.After;

public class GeoPkgVectorTest extends VectorApiTestBase {

    Pair<GeoPkgWorkspace, File> gpkg;

    protected VectorDataset createVectorData() throws Exception {
        gpkg = GeoPkgTests.open(R.raw.usa, "usa.gpkg");
        return (VectorDataset) gpkg.first().get("states");
    }

    @After
    public void tearDown() throws IOException {
        gpkg.first().close();
        FileUtils.deleteDirectory(gpkg.second());
    }
}

package org.jeo.geopkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.geodroid.tests.R;
import org.jeo.android.geopkg.GeoPkgWorkspace;
import org.jeo.data.TileApiTestBase;
import org.jeo.data.TileDataset;
import org.jeo.util.Pair;
import org.junit.After;

public class GeoPkgTileTest extends TileApiTestBase {

    Pair<GeoPkgWorkspace, File> gpkg;

    @Override
    protected TileDataset createTileData() throws Exception {
        gpkg = GeoPkgTests.open(R.raw.ne, "ne.gpkg");
        return (TileDataset) gpkg.first().get("tiles");
    }

    @After
    public void tearDown() throws IOException {
        gpkg.first().close();
        FileUtils.deleteDirectory(gpkg.second());
    }
}

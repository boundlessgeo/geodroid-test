package org.geodroid.test;

import org.jeo.geopkg.GeoPkgTileTest;
import org.jeo.geopkg.GeoPkgVectorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({GeoPkgVectorTest.class, GeoPkgTileTest.class})
public class GeodroidTestSuite {
}

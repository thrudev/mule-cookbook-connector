/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.cookbook.automation.functional;

import org.mule.modules.cookbook.CookbookConnector;
import org.mule.modules.cookbook.datasense.UpdateMetaData;
import org.mule.tools.devkit.ctf.junit.AbstractMetaDataTestCase;

public class UpdateMetaDataTestCases extends AbstractMetaDataTestCase<CookbookConnector> {

    public UpdateMetaDataTestCases() {
        super(TestDataBuilder.KEYS, UpdateMetaData.class, CookbookConnector.class);
    }

}

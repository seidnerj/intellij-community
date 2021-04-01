/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.nj2k;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("j2k/new/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/copyPastePlainText")
public class TextNewJavaToKotlinCopyPasteConversionTestGenerated extends AbstractTextNewJavaToKotlinCopyPasteConversionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("AsExpression.txt")
    public void testAsExpression() throws Exception {
        runTest("testData/copyPastePlainText/AsExpression.txt");
    }

    @TestMetadata("AsExpressionBody.txt")
    public void testAsExpressionBody() throws Exception {
        runTest("testData/copyPastePlainText/AsExpressionBody.txt");
    }

    @TestMetadata("ImportFromTarget.txt")
    public void testImportFromTarget() throws Exception {
        runTest("testData/copyPastePlainText/ImportFromTarget.txt");
    }

    @TestMetadata("ImportResolve.txt")
    public void testImportResolve() throws Exception {
        runTest("testData/copyPastePlainText/ImportResolve.txt");
    }

    @TestMetadata("InClassContextProperty.txt")
    public void testInClassContextProperty() throws Exception {
        runTest("testData/copyPastePlainText/InClassContextProperty.txt");
    }

    @TestMetadata("InsideIdentifier.txt")
    public void testInsideIdentifier() throws Exception {
        runTest("testData/copyPastePlainText/InsideIdentifier.txt");
    }

    @TestMetadata("IntoComment.txt")
    public void testIntoComment() throws Exception {
        runTest("testData/copyPastePlainText/IntoComment.txt");
    }

    @TestMetadata("IntoRawStringLiteral.txt")
    public void testIntoRawStringLiteral() throws Exception {
        runTest("testData/copyPastePlainText/IntoRawStringLiteral.txt");
    }

    @TestMetadata("IntoStringLiteral.txt")
    public void testIntoStringLiteral() throws Exception {
        runTest("testData/copyPastePlainText/IntoStringLiteral.txt");
    }

    @TestMetadata("KT13529.txt")
    public void testKT13529() throws Exception {
        runTest("testData/copyPastePlainText/KT13529.txt");
    }

    @TestMetadata("KT13529_1.txt")
    public void testKT13529_1() throws Exception {
        runTest("testData/copyPastePlainText/KT13529_1.txt");
    }

    @TestMetadata("KT32603.txt")
    public void testKT32603() throws Exception {
        runTest("testData/copyPastePlainText/KT32603.txt");
    }

    @TestMetadata("KT32604.txt")
    public void testKT32604() throws Exception {
        runTest("testData/copyPastePlainText/KT32604.txt");
    }

    @TestMetadata("LocalAndMemberConflict.txt")
    public void testLocalAndMemberConflict() throws Exception {
        runTest("testData/copyPastePlainText/LocalAndMemberConflict.txt");
    }

    @TestMetadata("LocalContextProperty.txt")
    public void testLocalContextProperty() throws Exception {
        runTest("testData/copyPastePlainText/LocalContextProperty.txt");
    }

    @TestMetadata("MembersIntoClass.txt")
    public void testMembersIntoClass() throws Exception {
        runTest("testData/copyPastePlainText/MembersIntoClass.txt");
    }

    @TestMetadata("MembersToTopLevel.txt")
    public void testMembersToTopLevel() throws Exception {
        runTest("testData/copyPastePlainText/MembersToTopLevel.txt");
    }

    @TestMetadata("Override.txt")
    public void testOverride() throws Exception {
        runTest("testData/copyPastePlainText/Override.txt");
    }

    @TestMetadata("OverrideInterface.txt")
    public void testOverrideInterface() throws Exception {
        runTest("testData/copyPastePlainText/OverrideInterface.txt");
    }

    @TestMetadata("PostProcessing.txt")
    public void testPostProcessing() throws Exception {
        runTest("testData/copyPastePlainText/PostProcessing.txt");
    }

    @TestMetadata("StatementsIntoFunction.txt")
    public void testStatementsIntoFunction() throws Exception {
        runTest("testData/copyPastePlainText/StatementsIntoFunction.txt");
    }

    @TestMetadata("TopLevelContextProperty.txt")
    public void testTopLevelContextProperty() throws Exception {
        runTest("testData/copyPastePlainText/TopLevelContextProperty.txt");
    }

    @TestMetadata("WholeFile.txt")
    public void testWholeFile() throws Exception {
        runTest("testData/copyPastePlainText/WholeFile.txt");
    }
}

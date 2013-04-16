/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.codeInsight.codeTransformations;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.plugin.codeInsight.codeTransformations.AbstractCodeTransformationTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({CodeTransformationsTestGenerated.IfToAssignment.class, CodeTransformationsTestGenerated.IfToReturn.class, CodeTransformationsTestGenerated.IfToReturnAsymmetrically.class, CodeTransformationsTestGenerated.WhenToAssignment.class, CodeTransformationsTestGenerated.WhenToReturn.class, CodeTransformationsTestGenerated.AssignmentToIf.class, CodeTransformationsTestGenerated.AssignmentToWhen.class, CodeTransformationsTestGenerated.ReturnToIf.class, CodeTransformationsTestGenerated.ReturnToWhen.class})
public class CodeTransformationsTestGenerated extends AbstractCodeTransformationTest {
    @TestMetadata("idea/testData/codeInsight/codeTransformations/branched/folding/ifToAssignment")
    public static class IfToAssignment extends AbstractCodeTransformationTest {
        public void testAllFilesPresentInIfToAssignment() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/codeInsight/codeTransformations/branched/folding/ifToAssignment"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("innerIfTransformed.kt")
        public void testInnerIfTransformed() throws Exception {
            doTestFoldIfToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/ifToAssignment/innerIfTransformed.kt");
        }
        
        @TestMetadata("simpleIf.kt")
        public void testSimpleIf() throws Exception {
            doTestFoldIfToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/ifToAssignment/simpleIf.kt");
        }
        
        @TestMetadata("simpleIfWithAugmentedAssignment.kt")
        public void testSimpleIfWithAugmentedAssignment() throws Exception {
            doTestFoldIfToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/ifToAssignment/simpleIfWithAugmentedAssignment.kt");
        }
        
        @TestMetadata("simpleIfWithBlocks.kt")
        public void testSimpleIfWithBlocks() throws Exception {
            doTestFoldIfToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/ifToAssignment/simpleIfWithBlocks.kt");
        }
        
        @TestMetadata("simpleIfWithShadowedVar.kt")
        public void testSimpleIfWithShadowedVar() throws Exception {
            doTestFoldIfToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/ifToAssignment/simpleIfWithShadowedVar.kt");
        }
        
        @TestMetadata("simpleIfWithUnmatchedAssignmentOps.kt")
        public void testSimpleIfWithUnmatchedAssignmentOps() throws Exception {
            doTestFoldIfToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/ifToAssignment/simpleIfWithUnmatchedAssignmentOps.kt");
        }
        
        @TestMetadata("simpleIfWithUnmatchedAssignments.kt")
        public void testSimpleIfWithUnmatchedAssignments() throws Exception {
            doTestFoldIfToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/ifToAssignment/simpleIfWithUnmatchedAssignments.kt");
        }
        
        @TestMetadata("simpleIfWithoutElse.kt")
        public void testSimpleIfWithoutElse() throws Exception {
            doTestFoldIfToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/ifToAssignment/simpleIfWithoutElse.kt");
        }
        
        @TestMetadata("simpleIfWithoutTerminatingAssignment.kt")
        public void testSimpleIfWithoutTerminatingAssignment() throws Exception {
            doTestFoldIfToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/ifToAssignment/simpleIfWithoutTerminatingAssignment.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/codeTransformations/branched/folding/ifToReturn")
    public static class IfToReturn extends AbstractCodeTransformationTest {
        public void testAllFilesPresentInIfToReturn() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/codeInsight/codeTransformations/branched/folding/ifToReturn"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("innerIfTransformed.kt")
        public void testInnerIfTransformed() throws Exception {
            doTestFoldIfToReturn("idea/testData/codeInsight/codeTransformations/branched/folding/ifToReturn/innerIfTransformed.kt");
        }
        
        @TestMetadata("simpleIf.kt")
        public void testSimpleIf() throws Exception {
            doTestFoldIfToReturn("idea/testData/codeInsight/codeTransformations/branched/folding/ifToReturn/simpleIf.kt");
        }
        
        @TestMetadata("simpleIfWithBlocks.kt")
        public void testSimpleIfWithBlocks() throws Exception {
            doTestFoldIfToReturn("idea/testData/codeInsight/codeTransformations/branched/folding/ifToReturn/simpleIfWithBlocks.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/codeTransformations/branched/folding/ifToReturnAsymmetrically")
    public static class IfToReturnAsymmetrically extends AbstractCodeTransformationTest {
        public void testAllFilesPresentInIfToReturnAsymmetrically() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/codeInsight/codeTransformations/branched/folding/ifToReturnAsymmetrically"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("simpleIf.kt")
        public void testSimpleIf() throws Exception {
            doTestFoldIfToReturnAsymmetrically("idea/testData/codeInsight/codeTransformations/branched/folding/ifToReturnAsymmetrically/simpleIf.kt");
        }
        
        @TestMetadata("simpleIfWithBlocks.kt")
        public void testSimpleIfWithBlocks() throws Exception {
            doTestFoldIfToReturnAsymmetrically("idea/testData/codeInsight/codeTransformations/branched/folding/ifToReturnAsymmetrically/simpleIfWithBlocks.kt");
        }
        
        @TestMetadata("simpleIfWithComments.kt")
        public void testSimpleIfWithComments() throws Exception {
            doTestFoldIfToReturnAsymmetrically("idea/testData/codeInsight/codeTransformations/branched/folding/ifToReturnAsymmetrically/simpleIfWithComments.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/codeTransformations/branched/folding/whenToAssignment")
    public static class WhenToAssignment extends AbstractCodeTransformationTest {
        public void testAllFilesPresentInWhenToAssignment() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/codeInsight/codeTransformations/branched/folding/whenToAssignment"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("innerWhenTransformed.kt")
        public void testInnerWhenTransformed() throws Exception {
            doTestFoldWhenToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/whenToAssignment/innerWhenTransformed.kt");
        }
        
        @TestMetadata("simpleWhen.kt")
        public void testSimpleWhen() throws Exception {
            doTestFoldWhenToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/whenToAssignment/simpleWhen.kt");
        }
        
        @TestMetadata("simpleWhenWithBlocks.kt")
        public void testSimpleWhenWithBlocks() throws Exception {
            doTestFoldWhenToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/whenToAssignment/simpleWhenWithBlocks.kt");
        }
        
        @TestMetadata("simpleWhenWithShadowedVar.kt")
        public void testSimpleWhenWithShadowedVar() throws Exception {
            doTestFoldWhenToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/whenToAssignment/simpleWhenWithShadowedVar.kt");
        }
        
        @TestMetadata("simpleWhenWithUnmatchedAssignments.kt")
        public void testSimpleWhenWithUnmatchedAssignments() throws Exception {
            doTestFoldWhenToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/whenToAssignment/simpleWhenWithUnmatchedAssignments.kt");
        }
        
        @TestMetadata("simpleWhenWithoutTerminatingAssignment.kt")
        public void testSimpleWhenWithoutTerminatingAssignment() throws Exception {
            doTestFoldWhenToAssignment("idea/testData/codeInsight/codeTransformations/branched/folding/whenToAssignment/simpleWhenWithoutTerminatingAssignment.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/codeTransformations/branched/folding/whenToReturn")
    public static class WhenToReturn extends AbstractCodeTransformationTest {
        public void testAllFilesPresentInWhenToReturn() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/codeInsight/codeTransformations/branched/folding/whenToReturn"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("innerWhenTransformed.kt")
        public void testInnerWhenTransformed() throws Exception {
            doTestFoldWhenToReturn("idea/testData/codeInsight/codeTransformations/branched/folding/whenToReturn/innerWhenTransformed.kt");
        }
        
        @TestMetadata("simpleWhen.kt")
        public void testSimpleWhen() throws Exception {
            doTestFoldWhenToReturn("idea/testData/codeInsight/codeTransformations/branched/folding/whenToReturn/simpleWhen.kt");
        }
        
        @TestMetadata("simpleWhenWithBlocks.kt")
        public void testSimpleWhenWithBlocks() throws Exception {
            doTestFoldWhenToReturn("idea/testData/codeInsight/codeTransformations/branched/folding/whenToReturn/simpleWhenWithBlocks.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToIf")
    public static class AssignmentToIf extends AbstractCodeTransformationTest {
        public void testAllFilesPresentInAssignmentToIf() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToIf"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("innerIfTransformed.kt")
        public void testInnerIfTransformed() throws Exception {
            doTestUnfoldAssignmentToIf("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToIf/innerIfTransformed.kt");
        }
        
        @TestMetadata("nestedIfs.kt")
        public void testNestedIfs() throws Exception {
            doTestUnfoldAssignmentToIf("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToIf/nestedIfs.kt");
        }
        
        @TestMetadata("simpleIf.kt")
        public void testSimpleIf() throws Exception {
            doTestUnfoldAssignmentToIf("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToIf/simpleIf.kt");
        }
        
        @TestMetadata("simpleIfWithAugmentedAssignment.kt")
        public void testSimpleIfWithAugmentedAssignment() throws Exception {
            doTestUnfoldAssignmentToIf("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToIf/simpleIfWithAugmentedAssignment.kt");
        }
        
        @TestMetadata("simpleIfWithBlocks.kt")
        public void testSimpleIfWithBlocks() throws Exception {
            doTestUnfoldAssignmentToIf("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToIf/simpleIfWithBlocks.kt");
        }
        
        @TestMetadata("simpleIfWithoutAssignment.kt")
        public void testSimpleIfWithoutAssignment() throws Exception {
            doTestUnfoldAssignmentToIf("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToIf/simpleIfWithoutAssignment.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToWhen")
    public static class AssignmentToWhen extends AbstractCodeTransformationTest {
        public void testAllFilesPresentInAssignmentToWhen() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToWhen"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("innerWhenTransformed.kt")
        public void testInnerWhenTransformed() throws Exception {
            doTestUnfoldAssignmentToWhen("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToWhen/innerWhenTransformed.kt");
        }
        
        @TestMetadata("simpleWhen.kt")
        public void testSimpleWhen() throws Exception {
            doTestUnfoldAssignmentToWhen("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToWhen/simpleWhen.kt");
        }
        
        @TestMetadata("simpleWhenWithBlocks.kt")
        public void testSimpleWhenWithBlocks() throws Exception {
            doTestUnfoldAssignmentToWhen("idea/testData/codeInsight/codeTransformations/branched/unfolding/assignmentToWhen/simpleWhenWithBlocks.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/codeTransformations/branched/unfolding/returnToIf")
    public static class ReturnToIf extends AbstractCodeTransformationTest {
        public void testAllFilesPresentInReturnToIf() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/codeInsight/codeTransformations/branched/unfolding/returnToIf"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("innerIfTransformed.kt")
        public void testInnerIfTransformed() throws Exception {
            doTestUnfoldReturnToIf("idea/testData/codeInsight/codeTransformations/branched/unfolding/returnToIf/innerIfTransformed.kt");
        }
        
        @TestMetadata("simpleIf.kt")
        public void testSimpleIf() throws Exception {
            doTestUnfoldReturnToIf("idea/testData/codeInsight/codeTransformations/branched/unfolding/returnToIf/simpleIf.kt");
        }
        
        @TestMetadata("simpleIfWithBlocks.kt")
        public void testSimpleIfWithBlocks() throws Exception {
            doTestUnfoldReturnToIf("idea/testData/codeInsight/codeTransformations/branched/unfolding/returnToIf/simpleIfWithBlocks.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/codeTransformations/branched/unfolding/returnToWhen")
    public static class ReturnToWhen extends AbstractCodeTransformationTest {
        public void testAllFilesPresentInReturnToWhen() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/codeInsight/codeTransformations/branched/unfolding/returnToWhen"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("innerWhenTransformed.kt")
        public void testInnerWhenTransformed() throws Exception {
            doTestUnfoldReturnToWhen("idea/testData/codeInsight/codeTransformations/branched/unfolding/returnToWhen/innerWhenTransformed.kt");
        }
        
        @TestMetadata("simpleWhen.kt")
        public void testSimpleWhen() throws Exception {
            doTestUnfoldReturnToWhen("idea/testData/codeInsight/codeTransformations/branched/unfolding/returnToWhen/simpleWhen.kt");
        }
        
        @TestMetadata("simpleWhenWithBlocks.kt")
        public void testSimpleWhenWithBlocks() throws Exception {
            doTestUnfoldReturnToWhen("idea/testData/codeInsight/codeTransformations/branched/unfolding/returnToWhen/simpleWhenWithBlocks.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("CodeTransformationsTestGenerated");
        suite.addTestSuite(IfToAssignment.class);
        suite.addTestSuite(IfToReturn.class);
        suite.addTestSuite(IfToReturnAsymmetrically.class);
        suite.addTestSuite(WhenToAssignment.class);
        suite.addTestSuite(WhenToReturn.class);
        suite.addTestSuite(AssignmentToIf.class);
        suite.addTestSuite(AssignmentToWhen.class);
        suite.addTestSuite(ReturnToIf.class);
        suite.addTestSuite(ReturnToWhen.class);
        return suite;
    }
}

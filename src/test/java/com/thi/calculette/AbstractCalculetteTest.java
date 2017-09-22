/*
 * Copyright ©1995-2011 thierryler.com - icauda.com
 * Copyright ©2011 Developpez.com
 *
 * Ces sources sont libres de droits, et vous pouvez les utiliser à votre 
 * convenance. 
 * 
 * http://www.thierryler.com - http://www.icauda.com 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.thi.calculette;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests de la calculette
 * 
 * REGLE CAL_RG_001.a, CAL_RG_001.b, CAL_RG_001.1.a, CAL_RG_001.1.b
 * 
 * @author Thierry Leriche-Dessirier
 * 
 */
public abstract class AbstractCalculetteTest {

    protected Calculette calculette;

    /**
     * Test de CAL_RG_001.a
     * 
     * PARAM a = 1 <br/>
     * PARAM b = 2 <br/>
     * RESULT = 3
     */
    @Test
    public void test_CAL_RG_001_a() {

	// Arrange
	final Integer a = 1;
	final Integer b = 2;

	final Integer expected = 3;

	// Act
	doTest_CAL_RG_001xxx(a, b, expected);
    }

    /**
     * Test de CAL_RG_001.b
     * 
     * PARAM a = 1 <br/>
     * PARAM b = -1 <br/>
     * RESULT = 0
     */
    @Test
    public void test_CAL_RG_001_b() {

	// Arrange
	final Integer a = 1;
	final Integer b = -1;

	final Integer expected = 0;

	// Act
	doTest_CAL_RG_001xxx(a, b, expected);
    }

    /**
     * Test de CAL_RG_001.1.a
     * 
     * PARAM a = 1 <br/>
     * PARAM b = null <br/>
     * RESULT = IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_CAL_RG_001_1_a() {

	// Arrange
	final Integer a = 1;
	final Integer b = null;

	// Act
	doTest_CAL_RG_001xxx(a, b, null);
    }

    /**
     * Test de CAL_RG_001.1.b
     * 
     * PARAM a = null <br/>
     * PARAM b = 2 <br/>
     * RESULT = IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_CAL_RG_001_1_b() {

	// Arrange
	final Integer a = null;
	final Integer b = 2;

	// Act
	doTest_CAL_RG_001xxx(a, b, null);
    }

    private void doTest_CAL_RG_001xxx(Integer a, Integer b, Integer expected) {

	// Act
	final Integer result = calculette.additionner(a, b);

	// Assert
	assertEquals(expected, result);
    }

}

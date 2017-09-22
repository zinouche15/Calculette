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

/**
 * Implementation simple du service de calculette.
 * 
 * @author Thierry Leriche-Dessirier
 * 
 */
public class SimpleCalculette extends AbstractCalculette implements Calculette {

    /**
     * {@inheritDoc}
     * 
     * REGLE CAL_RG_001, CAL_RG_001.1
     * 
     * @see Calculette#additionner(Integer, Integer)
     */
    public Integer additionner(Integer a, Integer b) {

	// REGLE CAL_RG_001.1 La fonction doit emettre une erreur si un des
	// parametres est <code>null</code>
	Util.checkNotNullOrThrowIAE(a, "Le param a ne peut pas etre null");
	Util.checkNotNullOrThrowIAE(b, "Le param b ne peut pas etre null");

	// CAL_RG_001 La fonction additionne deux entiers.
	return a + b;
    }

}

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
 * Service de calculette.
 * 
 * REGLE CAL_RG_001, CAL_RG_001.1
 * 
 * @author Thierry Leriche-Dessirier
 * 
 */
public interface Calculette {

    /**
     * Additionne deux entier.
     * 
     * REGLE CAL_RG_001, CAL_RG_001.1
     * 
     * CAL_RG_001 : La fonction additionne deux entiers.
     * 
     * Exemples : <br/>
     * a : a = 1, b = 2, result = 3 <br/>
     * b : a = 1, b = -1, result = 0
     * 
     * CAL_RG_001.1 : La fonction doit emettre une erreur si un des parametres
     * est <code>null</code>
     * 
     * Exemples : <br/>
     * a : a = 1, b = null, result = Exception <br/>
     * a : a = null, b = 2, Exception
     * 
     * @param a
     * @param b
     * @return La somme de {@code a} et {@code b}.
     * 
     * @throws IllegalArgumentException
     *             si un des arguments est <code>null</code>.
     */
    Integer additionner(Integer a, Integer b);

}

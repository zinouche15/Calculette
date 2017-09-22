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

import javax.annotation.Nullable;

/**
 * Quelques utilitaires en vrac.
 * 
 * @author Thierry Leriche-Dessirier
 * 
 */
public class Util {

    /**
     * Ensures that an object reference passed as a parameter to the calling
     * method is not null.
     * 
     * @param reference
     *            an object reference
     * @param errorMessage
     *            the exception message to use if the check fails; will be
     *            converted to a string using {@link String#valueOf(Object)}
     * @return the non-null reference that was validated
     * 
     * @throws IllegalArgumentException
     *             if {@code reference} is null
     */
    public static <T> T checkNotNullOrThrowIAE(T reference, @Nullable Object errorMessage) {
	if (reference == null) {
	    throw new IllegalArgumentException(String.valueOf(errorMessage));
	}
	return reference;
    }
}

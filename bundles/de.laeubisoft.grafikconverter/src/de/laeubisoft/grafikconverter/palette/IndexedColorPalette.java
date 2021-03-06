//   Copyright 2017 Christoph Läubrich
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
package de.laeubisoft.grafikconverter.palette;

import de.laeubisoft.grafikconverter.ARGBPixel;

public interface IndexedColorPalette extends ColorPalette {

    /**
     * @param pixel
     * @return the lowest color index in this palette for the given pixel color
     *         or -1 if no palette color can be found
     */
    public int getColorIndex(ARGBPixel pixel);

    /**
     * returns the Color at the given index
     * 
     * @param pixel
     * @param index
     */
    public boolean getColorAtIndex(ARGBPixel pixel, int index);

    /**
     * @return the maximum color index
     */
    public int getMaxColorIndex();
}

[ ![Download](https://api.bintray.com/packages/bcgdv/android/dotsprogress/images/download.svg)](https://bintray.com/bcgdv/android/dotsprogress/_latestVersion)

# DotsProgressIndicator widget for Android

This is a indeterminate progress indicator for android that shows a dots bouncing animation for the progress indicator.

![Demo](https://i.giphy.com/3ohhweP8FYf0huURvG.gif)

## Adding it to your project

    implementation 'com.bcgdv.asia.lib:dots:${dots_version}'

## Usage

### The progress bar needs to be configured in the XML.

```xml
    <com.bcgdv.asia.lib.dots.DotsProgressIndicator
        android:id="@+id/dotsProgressIndicatorView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:dotsMode="bestFit"
        app:dotsSpacing="2dp"
        app:dotsDiameter="20dp"
        app:dotsColors="@array/dotsColors"
        app:numberOfDots="4"
        app:visibilityChangeDelay="1000" />
```

After specifying the widget in XML, it will be triggered to animate
when the widget is visible. When the visibility is set to `HIDDEN` or `GONE`,
the animation will be stopped.

#### Options explained

#### `app:dotsMode`

If `bestFit` The size of the dots will be determined by the width of
the widget and the number of dots.
If `setSize` The size of the dots will be specified in the `dotsDiameter` option.

Options: `bestFit|setSize` Default `bestFit`
`app:dotsSpacing` Options: `bestFit|setSize` Default `bestFit`

#### `app:dotsSpacing`

Specifies the space between the dots. Default is 4dp.

#### `app:dotsDiameter`

The diameter of each dot in 4dp. If `dotsMode` is set to `setSize` then
this field is required. Default value 0dp.

#### `app:dotsColors`

An array specifying the colors of each dot. This is optional however for best
results, it is recommended you provide colors that suit your app.

You need to specify a colors array as follows:

    <color name="red">#ff0000</color>
    <color name="blue">#0000FF</color>
    <color name="green">#00FFFF</color>
    <color name="yellow">#FFFF00</color>
    <color name="black">#000000</color>
    <color name="magenta">#FF00FF</color>

    <array name="dotColors">
        <item>@color/red</item>
        <item>@color/blue</item>
        <item>@color/green</item>
        <item>@color/yellow</item>
        <item>@color/black</item>
        <item>@color/magenta</item>
    </array>

If you specify fewer colors than dots, the colors will repeat.

### `app:numberOfDots`

The number of dots to show in the progress indicator. Default is 3.

### `app:visibilityChangeDelay`

When you set or hide the visibility of the widget, this value will wait
for the specified number of milliseconds before triggering the change.
This is useful when you want to make sure that the widget does not flicker or flash
on the screen if it's being set to visible or hidden rapidly. Default value is `1000` ms.

## License


    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
**＊＊＊ 繁體中文在後面 ＊＊＊**

# Things Commander

## Demo video

[https://youtu.be/qRGXE2Nel3k](https://youtu.be/qRGXE2Nel3k)

[https://youtu.be/zprp-rrPiHA](https://youtu.be/zprp-rrPiHA)

## Hardware and parts

* [Raspberry Pi 3 - Model B - ARMv8 with 1G RAM](https://www.adafruit.com/products/3055) (with power supply and MicroSD)
* [Raspberry Pi Camera Module v2](https://www.raspberrypi.org/products/camera-module-v2/)
* [Servo Motor, Tower Pro SG90](http://www.towerpro.com.tw/product/sg90-7/)
* [DAC MCP3008 - 8-Channel 10-Bit ADC With SPI Interface](https://www.adafruit.com/products/856)
* [Breadboard trim potentiometer - 10K](https://www.adafruit.com/products/356)
* [Photo cell (CdS photoresistor)](https://www.adafruit.com/products/161)
* [Analog 2-axis Thumb Joystick with Select Button + Breakout Board](https://www.adafruit.com/products/512)
* [MQ-2](http://smart-prototyping.com/MQ2-gas-sensors-module.html)
* [Reed Switch Sensor Module](https://www.itead.cc/reed-switch-sensor-module.html)
* LED
* [Breadboarding wire bundle](https://www.adafruit.com/products/153)
* [Female/Male Jumper Wires](https://www.adafruit.com/products/1954)
* [USB to TTL Serial Cable - Debug / Console Cable for Raspberry Pi](https://www.adafruit.com/product/954)
* [Monochrome 0.96" 128x64 OLED graphic display](https://www.adafruit.com/products/326)
* [Lego Beach Hut](http://shop.lego.com/en-US/Beach-Hut-31035)

## System and software

* Raspberry Pi
    * Android Things preview 0.2
* PC or Mac
    * Android Studio
    * Android SDK version 24
    * Build tool version 24.0.3
* [Firebase](https://firebase.google.com)
    * Realtime Database
    * Rule configuration:

            {
              "rules": {
                ".read": true,
                ".write": true
              }
            }    
    
    * Add Android things and Android mobile app application

## Known issue

* Refer [Android Things Developer Preview 2 release notes](https://developer.android.com/things/preview/releases.html#developer_preview_2), especially Known Issues.

## Contents

* projects
    * ThingsCommander: Android Things App
    * ThingsCommanderApp: Android mobile App
* resources
    * thingscommander-f3f74-export.json: firebase realtime database export file

# Things Commander(中文)

## 示範影片

[https://youtu.be/qRGXE2Nel3k](https://youtu.be/qRGXE2Nel3k)

[https://youtu.be/zprp-rrPiHA](https://youtu.be/zprp-rrPiHA)

## 硬體與零件

* [Raspberry Pi 3 - Model B - ARMv8 with 1G RAM](https://www.adafruit.com/products/3055) (with power supply and MicroSD)
* [Raspberry Pi 相機模組 v2](https://www.raspberrypi.org/products/camera-module-v2/)
* [伺服馬達, Tower Pro SG90](http://www.towerpro.com.tw/product/sg90-7/)
* [類比數位轉換器 MCP3008 - 8-Channel 10-Bit ADC With SPI Interface](https://www.adafruit.com/products/856)
* [可變電阻 - 10K](https://www.adafruit.com/products/356)
* [光敏電阻](https://www.adafruit.com/products/161)
* [搖桿模組](https://www.adafruit.com/products/512)
* [MQ-2](http://smart-prototyping.com/MQ2-gas-sensors-module.html)
* [磁簧開關模組](https://www.itead.cc/reed-switch-sensor-module.html)
* LED
* [麵包板連接線](https://www.adafruit.com/products/153)
* [公母杜邦線](https://www.adafruit.com/products/1954)
* [USB轉TTL序列埠](https://www.adafruit.com/product/954)
* [單色顯示器、0.96吋、128x64](https://www.adafruit.com/products/326)
* [樂高海灘小屋](http://shop.lego.com/en-US/Beach-Hut-31035)

## 系統與軟體

* Raspberry Pi
    * Android Things preview 0.2
* 個人電腦，PC或Mac
    * Android Studio
    * Android SDK version 24
    * Build tool version 24.0.3
* [Firebase](https://firebase.google.com)
    * 即時資料庫（Realtime Database）
    * 規則設定:

            {
              "rules": {
                ".read": true,
                ".write": true
              }
            }    
    
    * 新增Android things與Android mobile app應用程式

## 已知的問題

* 參考 [Android Things Developer Preview 2 release notes](https://developer.android.com/things/preview/releases.html#developer_preview_2), 特別注意Known Issues的說明。

## 內容

* projects
    * ThingsCommander: Android Things App
    * ThingsCommanderApp: Android mobile App
* resources
    * thingscommander-f3f74-export.json: firebase即時資料庫匯出檔案

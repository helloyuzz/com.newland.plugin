# com.newland.plugin
 新大陆PDA适配  
**dev environment:**  
>  angular 7.2.4 + Ionic 5.0.2  +	Cordova 9.0.0  

	Newland Barcode Scanner  
	Model:  
	Android 8.0  
	
	
	
	
#### Config File 1:  
<project_root>\plugins\android.json
```xml
"dependent_plugins": {
    "com.newland.plugin": {
      "PACKAGE_NAME": "io.logichealth.packpress"
    }
}
```

#### Config File 2:  
<project_root>\src\app.component.ts
```javascript
leg newlandscanner: any;

InitScanner() {
    newlandscanner.scan((barcode) => {
      this.PublishBarcode(this.event, barcode);
    });
  }
```

#### Config File 3:  
<project_root>\angular.json
```xml
"scripts": [
      "plugins/com.newland.plugin/www/newlandscanner.js"
   ]
```

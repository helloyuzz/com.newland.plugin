/*global cordova, module*/

module.exports = {
    scan: function (success) {
        cordova.exec(success, function() {}, "NewlandScanner", "scan", "");
    }
};

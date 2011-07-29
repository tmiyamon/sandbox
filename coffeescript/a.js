google.maps.event.addDomListener(window, 'load', function() {
  var GakeIine, initialize;
  GakeIine = {
    mapOptions: {
      navigationControl: true,
      mapTypeControl: true,
      scaleControl: true,
      center: new google.maps.LatLng(37.525792, 137.325482),
      zoom: 8,
      mapTypeId: google.maps.MapTypeId.ROADMAP
    },
    dataUrl: 'http://localhost:8000/data.json',
    audio: (function() {
      var audio;
      if (HTMLAudioElement) {
        audio = new Audio("snd/josei1.wav");
        audio.volume = 0.1;
        return audio;
      }
    })(),
    iine: function() {
      var audio;
      audio = GakeIine.audio;
      if (audio != null) {
        audio.load();
        audio.play();
      }
      return false;
    },
    buildEntry: function(map, entry) {
      var id, img, infocontent, infowindow, lat, latlng, lng, marker;
      if ((entry != null) && (entry.lat != null) && (entry.lng != null) && (entry.img != null) && (entry.id != null)) {
        id = entry.id, lat = entry.lat, lng = entry.lng, img = entry.img;
        latlng = new google.maps.LatLng(lat, lng);
        infocontent = $('<div></div>').attr('id', 'gake_' + id).append($('<img></img>').attr('src', '')).append($('<span></span>').attr('id', 'iine_' + id).bind('click', GakeIine.iine).append($('<img></img>').attr({
          'class': 'like',
          'src': 'img/like2.png'
        })));
        infowindow = new google.maps.InfoWindow({
          content: infocontent[0]
        });
        marker = new google.maps.Marker({
          position: latlng,
          map: map,
          title: 'Gake Iine!'
        });
        return google.maps.event.addListener(marker, 'click', function() {
          return infowindow.open(map, marker);
        });
      }
    }
  };
  $('#like').bind('click', function() {
    var audio;
    audio = GakeIine.audio;
    if (audio != null) {
      audio.load();
      audio.play();
    }
    return false;
  });
  initialize = function() {
    var canvas, map;
    canvas = $('#map_canvas');
    if (canvas.length) {
      map = new google.maps.Map(canvas[0], GakeIine.mapOptions);
    }
    return $.getJSON(GakeIine.dataUrl, function(json) {
      var entry, _i, _len, _ref, _results;
      _ref = json['entry'];
      _results = [];
      for (_i = 0, _len = _ref.length; _i < _len; _i++) {
        entry = _ref[_i];
        _results.push(GakeIine.buildEntry(map, entry));
      }
      return _results;
    });
  };
  return initialize();
});
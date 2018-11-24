//Insert code below


var url = 'http://starlord.hackerearth.com/gamesarena';
var gamesData;
function httpGetAsync(theUrl, callback) {
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function () {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200)
            callback(xmlHttp.responseText);
    }
    xmlHttp.open("GET", theUrl, true); // true for asynchronous 
    xmlHttp.send(null);
}

httpGetAsync(url, displayGrid(), function (data) {
    gamesData = JSON.parse(data);
    gamesData.shift()
    var gameContainer = document.getElementById('games-list');
    var listContainer = document.getElementById('list');
    for (let game in gamesData) {
        var div = document.createElement("div");
        var hr = document.createElement("hr");
        div.setAttribute('class', 'list-item');
        var topDiv = document.createElement("div");
        topDiv.setAttribute('class', 'top-div');
        var img = document.createElement("img");
        img.setAttribute('src', '/Users/pc/Desktop/WebApp/5f18474356f1c56cfa8a86a09f4e9854.jpg');
        img.setAttribute('class', 'img-icon');
        var name = document.createElement("span");
        name.appendChild(document.createTextNode(gamesData[game].title));
        name.setAttribute('style', 'margin-left: 10px');
        name.setAttribute('class', 'game-name');
        topDiv.appendChild(img);
        topDiv.appendChild(name);
        var bottomDiv = document.createElement("div");
        bottomDiv.setAttribute('class', 'bottom-div');
        var span = document.createElement("span");
        var genre = document.createElement("span");
        span.appendChild(document.createTextNode(gamesData[game].genre));
        genre.appendChild(document.createTextNode('Genre : '));
        bottomDiv.appendChild(hr);
        bottomDiv.appendChild(genre);
        bottomDiv.appendChild(span);
        div.appendChild(topDiv);
        div.appendChild(hr);
        div.appendChild(bottomDiv);
        listContainer.appendChild(div);
    }
});

function displayGrid(gridData) {
    gamesData = JSON.parse(data);
    gamesData.shift()
    var gameContainer = document.getElementById('games-list');
    var listContainer = document.getElementById('list');
    for (let game in gamesData) {
        var div = document.createElement("div");
        var hr = document.createElement("hr");
        div.setAttribute('class', 'list-item');
        var topDiv = document.createElement("div");
        topDiv.setAttribute('class', 'top-div');
        var img = document.createElement("img");
        img.setAttribute('src', '/Users/pc/Desktop/WebApp/5f18474356f1c56cfa8a86a09f4e9854.jpg');
        img.setAttribute('class', 'img-icon');
        var name = document.createElement("span");
        name.appendChild(document.createTextNode(gamesData[game].title));
        name.setAttribute('style', 'margin-left: 10px');
        name.setAttribute('class', 'game-name');
        topDiv.appendChild(img);
        topDiv.appendChild(name);
        var bottomDiv = document.createElement("div");
        bottomDiv.setAttribute('class', 'bottom-div');
        var span = document.createElement("span");
        var genre = document.createElement("span");
        span.appendChild(document.createTextNode(gamesData[game].genre));
        genre.appendChild(document.createTextNode('Genre : '));
        bottomDiv.appendChild(hr);
        bottomDiv.appendChild(genre);
        bottomDiv.appendChild(span);
        div.appendChild(topDiv);
        div.appendChild(hr);
        div.appendChild(bottomDiv);
        listContainer.appendChild(div);
}

function filterGames(){
    var search = document.getElementById('search');
    var filter = search.value.toUpperCase();
    var games = document.getElementsByClassName('list-item');

    for (item in games) {
        console.log(games[item]);
    }
    
}

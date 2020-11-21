/*
* Add Events and functions to move the Ship and Win the game
*/
// Creates the Grid -- this should only occur after the DOM loads
document.addEventListener('DOMContentLoaded', () => {
   
    createGrid();

    document.querySelector('body').addEventListener('keydown', (event) => {

        if (event.key === 'ArrowRight') {
            moveShipRight();
        }
        if (event.key === 'ArrowLeft') {
            moveShipLeft();
        }
        if (event.key === 'ArrowUp') {
            moveShipUp();
        }
        if (event.key === 'ArrowDown') {
            moveShipDown();
        }

    });

    // When reset is clicked call resetGame()
    const reset = document.getElementById('resetButton');
    reset.addEventListener('click', (event) => {
        event.preventDefault();
        resetGame();
    });

});

function moveShipUp() {
    const ship = getShipLocation();

    const index = Array.from(ship.parentNode.children).indexOf(ship);
    const newParent = ship.parentElement.previousElementSibling;
    if (newParent != null) {
        const down = newParent.childNodes[index];
        moveShip(ship, down); 
    }
}

function moveShipDown() {
    const ship = getShipLocation();

    const index = Array.from(ship.parentNode.children).indexOf(ship);
    const newParent = ship.parentElement.nextElementSibling;
    if (newParent != null) {
        const down = newParent.childNodes[index];
        moveShip(ship, down);
    }
}

function moveShipLeft() {
    const ship = getShipLocation();
    const left = ship.previousElementSibling;
    moveShip(ship, left);
}

function moveShipRight() {
    const ship = getShipLocation();
    const right = ship.nextElementSibling;
    moveShip(ship, right);
}

function moveShip(shipLocation, newLocation) {
    if (canMoveToNewLocation(newLocation)) {
        if (isWin(newLocation)) {
            win();
        } else {
            shipLocation.classList.remove('boat');
            newLocation.classList.add('boat');
        }
    }
}

function canMoveToNewLocation( newLocation ) {
    if (newLocation == null || newLocation.classList.contains('pirate')) {
        return false;
    }
    return true;
}

function isWin(nextLocation) {
    return nextLocation.classList.contains('treasure');
}

function win() {
    // Change the text to say "You win!"
    // Change the class of the text to .winText
    const announce = document.querySelector('.announce');
    announce.innerText = "You Win!";
    announce.classList.add('winText');
    // Remove the ship
    getShipLocation().classList.remove('boat');
}

/**
 * Reset the Game
 */
function resetGame() {
    const ship = getShipLocation();
    if (ship != null) {
        ship.classList.remove('boat');
    }
    // Inform the user they can start
    document.querySelector('.announce').innerText = "Play!";

    const frame = document.getElementById('frame');
    // Set the starting location of the player (.boat)
    frame.firstElementChild.firstElementChild.classList.add('boat');
    // If the last frame is a pirate remove it
    if (frame.lastElementChild.lastElementChild.classList.contains('pirate')) {
        frame.lastElementChild.lastElementChild.classList.remove('pirate');
    }
    // Set the starting location of the treasure (.treasure)
    frame.lastElementChild.lastElementChild.classList.add('treasure');
}

function getShipLocation() {
    return document.getElementById('frame').querySelector('.boat');
}

/**
 * Creates the game grid
 */
function createGrid() {
    // Get a reference to the frame
    const frame = document.getElementById('frame');
    // Add Code to create the game grid
    for (let i = 0; i < 10 ; i++) {
        buildRow(frame); 
    }
    resetGame();
}

/**
 * Builds the grid rows
 * @param {element} frame 
 */
function buildRow(frame) {
   // Add code to create rows
    // Create a div
    const row = document.createElement('div');
    // add the class .row
    row.setAttribute('class', 'row');
    // insert as the last child of the parent (frame)
    frame.appendChild(row);

    for (let i = 0; i < 10 ; i++) {
        buildSquare(row, i); 
    }    
}

/**
 * Builds the grid squares 
 * @param {element} row 
 * @param {int} count 
 */
function buildSquare(row, count) {
   // Add code to create the grid Squares

   // Create a div
   const square = document.createElement('div');
   
   // add the css class square
   square.classList.add('square');

    // Randomly creates pirates, but not on the first elemment
    if (count > 1) {
        if ((Math.floor(Math.random() * 100) + 1) > 85) {
            // Add the pirates here
            square.classList.add('pirate');
        } 
    }

    // append the div to the parent row
    row.insertAdjacentElement('beforeend', square);
}




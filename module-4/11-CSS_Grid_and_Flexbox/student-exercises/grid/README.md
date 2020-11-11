# CSS Grid Exercise

In this exercise, you'll take the existing HTML in `index.html`, and write CSS in `style.css` to create three different grid layouts that reproduce the example images below. 

The three layouts are treated as a desktop layout (greater than 1024px), "small" desktop/tablet layout (less than or equal to 1024px), and a phone layout (less than or equal to 450px):

**Layout 1** - Desktop:

![Layout 1](./layouts/layout-1.png)

**Layout 2** - Tablet:

![Layout 2](./layouts/layout-2.png)

**Layout 3** - Phone:

![Layout 3](./layouts/layout-3.gif)

You'll use CSS media queries to create these three layouts in a responsive manner. You shouldn't have to modify any of the existing HTML to complete this exercise.


## Before you begin

Take a moment to explore the HTML file and its structure. Take note of the `<main>`, `<h1>` and `<div>` blocks, and how the content in each block is displayed in the different layouts. 

Also, look at the existing CSS in `style.css` that was set up for you. Colors and other styling has already been set up for you. You're only responsible for setting up the CSS grids in this exercise.

## Step One: Identify grid areas 

Before starting on any of the grid layouts, the grid areas need to be defined in the CSS.

You'll need to define two grid container elements that can be located using their `id` attributes: `main-grid` and `experience-grid`. Note how `experience-grid` is a child element of `main-grid`.

## Step Two: Create the desktop layout

Now that the grid areas have been defined, you can create and style the grids.

Now your page should look like the "Layout 1 - Desktop" image.

## Step Three: Create the tablet layout

After the rules that you set up in steps one and two, create a media query with a `max-width` of 1024px. 

For `main-grid`, set the column gap to 35px, and change the columns to two evenly sized columns. Redefine the grid areas to match the "Layout 2 - Tablet" image.

For `experience-grid`, set both the row and column gaps to 20px, and redefine the grid areas to match the "Layout 2 - Tablet" image.

In your browser, if you resize the window or use the dev tools, you can test your new tablet layout. Your page should look like the "Layout 2 - Tablet" image.

## Step Four: Create the phone layout

Beneath the media query you created in step three, add another one with a `max-width` of 450px. 

Set both grids to be one column wide, and redefine the grid areas to match the "Layout 3 - Phone" image from above.

In your browser, if you resize the window or use the dev tools, you can test your new phone layout. Your page should look like the "Layout 3 - Phone" image. You may have to refresh your browser to see the changes.

import {And, When, Then, Given } from "cypress-cucumber-preprocessor/steps";


Given("E-bebek sitesine git", ()=>{
    cy.viewport('macbook-16')
    cy.visit("https://www.e-bebek.com/")
})

And("Spani kapat", ()=>{
    cy.get('.justify-content-between > .cookies__img-wrapper').should('be.visible').click()
})

When("{string} yaz", (product)=>{
    cy.get('#txtSearchBox').should('be.visible').type(product)
    cy.wait(2000)
})

Then("Ilk biberonu sec", ()=>{
    cy.get(':nth-child(1) > .has-media').should('be.visible').click()
    cy.wait(2000)
})

And("Ilk biberonu sepete ekle", ()=>{
    cy.get('#addToCartBtn').should('be.visible').click()
    cy.wait(2000)
})

Then("Sepeti gore tikla", ()=>{
    cy.get('#btnShowCart').should('be.visible').click()
})

 
 


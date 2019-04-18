<#include "security.ftl" >
<#import "login.ftl" as l>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Project X</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/main">Main page</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/templator">New template</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/user">User List</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/uploadDocument">Upload document</a>
            </li>
        </ul>
        <div class="navbar-text mr-3">${name}</div>
        <div class="navbar-text"><@l.logout /></div>
    </div>
</nav>
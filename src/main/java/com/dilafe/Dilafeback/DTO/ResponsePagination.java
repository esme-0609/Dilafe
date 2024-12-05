package com.dilafe.Dilafeback.DTO;

import com.dilafe.Dilafeback.Entities.Product;

import java.util.List;

public class ResponsePagination<Product> {

    private List<Product> content;      // Contenido de la página (por ejemplo, una lista de productos)
    private long totalElements;   // Total de elementos disponibles
    private int totalPages;       // Total de páginas disponibles
    private int currentPage;      // Página actual
    private int pageSize;         // Tamaño de la página (número de elementos por página)
    private boolean first;        // Indica si es la primera página
    private boolean last;         // Indica si es la última página
    private boolean hasNext;      // Indica si hay más páginas después de esta
    private boolean hasPrevious;

    public ResponsePagination(List<Product> content, long totalElements, int totalPages, int currentPage, int pageSize,
                              boolean first, boolean last, boolean hasNext, boolean hasPrevious) {
        this.content = content;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.first = first;
        this.last = last;
        this.hasNext = hasNext;
        this.hasPrevious = hasPrevious;
    }

    public List<Product> getContent() {
        return content;
    }

    public void setContent(List<Product> content) {
        this.content = content;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public boolean isHasPrevious() {
        return hasPrevious;
    }

    public void setHasPrevious(boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
    }
}

package project;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

/**
 * @author sai deekshith
 * @category
 */
public class Ecommerce extends JFrame {

    // ---------------------------- Models ----------------------------
    static class Productt {
        String name, brand, description;
        double price, rating;
        int quantity = 1;

        Productt(String name, String brand, double price, double rating, String desc) {
            this.name = name;
            this.brand = brand;
            this.price = price;
            this.rating = rating;
            this.description = desc;
        }

        public String toString() { return name + " (" + brand + ")"; }

        public String toCartString() {
            return quantity + "× " + name + " – ₹" + String.format("%.2f", price * quantity);
        }
    }

    // Represents subcategory which have products
    static class SubCategory {
        String name;
        List<Productt> prods;

        public SubCategory(String name, List<Productt> prods) {
            this.name = name;
            this.prods = prods;
        }
        public String toString() { return name; }
    }

    // Represents a category which have subcategories
    static class Category {
        String name;
        List<SubCategory> subs;

        Category(String n, List<SubCategory> subs) {
            name = n;
            this.subs = subs;
        }
        public String toString() { return name; }
    }

    // ---------------------------- Fields ----------------------------

    // Catalog and Cart
    private final List<Category> catalog = new ArrayList<>();
    private final List<Productt> cart = new ArrayList<>();

    // UI
    private JTextField tfSearch;
    private JLabel lblCartCount;
    private JLabel lblTotal;
    private JTextArea taCart;
    private JPanel productGrid; // center grid to show product cards
    private JTree categoryTree; // left sidebar

    // ---------------------------- Constructor ----------------------------

    public Ecommerce() {
        setTitle("ECommerce");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1100, 700);
        setLocationRelativeTo(null);

        buildCatalog();
        buildingUI();
        loadAllProducts();
        refreshCart();

        setVisible(true);
    }

    // ---------------------------- Catalog ----------------------------

    private void buildCatalog() {
        catalog.clear();

        // ---------------- Gadgets & Accessories ----------------
        catalog.add(new Category("Gadgets & Accessories", Arrays.asList(
            new SubCategory("Smartphones", Arrays.asList(
                new Productt("OnePlus Nord CE 3", "OnePlus", 24999, 4.4, "6.7\" AMOLED display, Snapdragon 782G, 50MP triple camera, OxygenOS."),
                new Productt("Moto G85", "Motorola", 18999, 4.3, "120Hz pOLED display, Snapdragon 6 Gen 1, clean Android experience."),
                new Productt("Realme Narzo 70", "Realme", 14999, 4.2, "Dimensity 6100+, 90Hz display, vapor cooling, AI camera."),
                new Productt("Tecno Spark 20", "Tecno", 9499, 4.1, "13MP AI dual camera, 8GB RAM, Helio G85 processor."),
                new Productt("Infinix Zero 5G", "Infinix", 11999, 4.0, "Dimensity 920 SoC, 120Hz refresh, 5000mAh battery.")
            )),
            new SubCategory("Wearables", Arrays.asList(
                new Productt("Amazfit GTR Mini", "Amazfit", 8999, 4.3, "1.28\" AMOLED, 14-day battery, GPS, 120+ sports modes."),
                new Productt("boAt Storm Pro", "boAt", 2799, 4.2, "1.78” AMOLED, heart rate monitor, sleep tracking."),
                new Productt("Fire-Boltt Invincible", "Fire-Boltt", 6499, 4.4, "Bluetooth calling, 1.43” AMOLED, Always-on display."),
                new Productt("NoiseFit Halo", "Noise", 3799, 4.1, "Premium metal body, AMOLED screen, 100+ watch faces."),
                new Productt("Fitbit Inspire 3", "Fitbit", 7999, 4.5, "24/7 heart rate, Active Zone Minutes, stress management.")
            )),
            new SubCategory("Audio Gear", Arrays.asList(
                new Productt("JBL Tune 770NC", "JBL", 6999, 4.4, "ANC headphones with 70-hour battery and dual pairing."),
                new Productt("Realme Buds T300", "Realme", 2299, 4.3, "30dB ANC, 40-hour playback, 12.4mm dynamic drivers."),
                new Productt("OnePlus Bullets Z2", "OnePlus", 1999, 4.2, "Magnetic earbuds, 12.4mm drivers, fast charging."),
                new Productt("Sony WF-C500", "Sony", 4999, 4.5, "IPX4 rating, 20-hour battery, DSEE audio upscaling."),
                new Productt("boAt Rockerz 255 Pro+", "boAt", 1399, 4.3, "Dual pairing, ASAP Charge, 40 hours battery.")
            ))
        )));

        // ---------------- Furniture & Furnishings ----------------
        catalog.add(new Category("Furniture & Furnishings", Arrays.asList(
            new SubCategory("Living Room", Arrays.asList(
                new Productt("Recliner Sofa", "Urban Ladder", 24999, 4.5, "Manual recliner with plush upholstery and sturdy frame."),
                new Productt("Coffee Table", "WoodenStreet", 5999, 4.3, "Sheesham wood table with open shelf and premium finish."),
                new Productt("TV Unit", "Pepperfry", 10999, 4.4, "Compact entertainment unit with ample storage."),
                new Productt("Bookshelf", "Hometown", 4499, 4.1, "5-tier modern design bookshelf, walnut finish."),
                new Productt("Floor Lamp", "IKEA", 2999, 4.0, "Tall standing lamp with linen shade and soft glow.")
            )),
            new SubCategory("Bedroom", Arrays.asList(
                new Productt("Queen Bed Frame", "Durfi", 15999, 4.4, "Hydraulic storage bed with headboard and teak finish."),
                new Productt("Mattress (78x60)", "Sleepyhead", 8999, 4.5, "Orthopedic memory foam, dual comfort, 10-year warranty."),
                new Productt("Bedside Table", "Nilkamal", 1999, 4.2, "Compact table with drawer and shelf, engineered wood."),
                new Productt("Wardrobe (3-door)", "Godrej Interio", 15999, 4.3, "Spacious with mirror panel, lockable drawers."),
                new Productt("Wall Mirror", "HomeTown", 1199, 4.1, "Framed mirror ideal for dressing area or hallway.")
            )),
            new SubCategory("Furnishing", Arrays.asList(
                new Productt("Cotton Curtains", "Spaces", 1299, 4.2, "Set of 2 blackout curtains, 7 ft length, eyelet design."),
                new Productt("Doormat Set", "Home Centre", 799, 4.0, "Set of 3 anti-slip door mats, machine washable."),
                new Productt("Wall Stickers", "Decoreasy", 499, 4.3, "Removable vinyl wall decals for kids’ rooms."),
                new Productt("Cushion Covers", "FabIndia", 999, 4.2, "Set of 5 decorative cotton cushion covers."),
                new Productt("Window Blinds", "Livpure", 1699, 4.1, "Zebra roller blinds with day & night adjustment.")
            ))
        )));

        // ---------------- Health & Wellness ----------------
        catalog.add(new Category("Health & Wellness", Arrays.asList(
            new SubCategory("Supplements", Arrays.asList(
                new Productt("Whey Protein (1kg)", "Optimum Nutrition", 2499, 4.6, "24g protein per scoop, fast absorption, chocolate flavor."),
                new Productt("Omega-3 Capsules", "HealthKart", 699, 4.3, "1000mg fish oil, EPA & DHA rich, 60 softgels."),
                new Productt("Multivitamins", "MuscleBlaze", 599, 4.2, "Daily essential vitamins & minerals for men."),
                new Productt("Biotin Gummies", "Power Gummies", 799, 4.1, "Hair & skin support with biotin and zinc."),
                new Productt("Apple Cider Vinegar", "Kapiva", 499, 4.0, "Raw, unfiltered with mother, good for digestion.")
            )),
            new SubCategory("Personal Care", Arrays.asList(
                new Productt("Face Wash", "Mamaearth", 299, 4.3, "Tea tree face wash for acne-prone skin, 100ml."),
                new Productt("Body Lotion", "Nivea", 349, 4.2, "Shea butter lotion for dry skin, 400ml."),
                new Productt("Hair Oil", "Indulekha", 449, 4.4, "Ayurvedic hair oil with bhringraj, 100ml."),
                new Productt("Shampoo", "Tresemme", 299, 4.1, "Keratin smooth shampoo, 340ml bottle."),
                new Productt("Toothpaste", "Colgate", 149, 4.0, "Colgate Visible White for whiter teeth in 1 week.")
            )),
            new SubCategory("Medical Devices", Arrays.asList(
                new Productt("Digital Thermometer", "Dr Trust", 399, 4.5, "Accurate temperature reading with beeper alert."),
                new Productt("Oximeter", "BPL", 999, 4.4, "SpO2 monitor with pulse reading, LED display."),
                new Productt("BP Monitor", "Omron", 1999, 4.6, "Automatic arm cuff BP monitor, memory storage."),
                new Productt("Weighing Scale", "HealthSense", 999, 4.3, "Digital weight scale with BMI calculator."),
                new Productt("Nebulizer", "Philips", 2299, 4.4, "Compact home-use nebulizer for children and adults.")
            ))
        )));
    }

    // ---------------------------- UI Construction ----------------------------

    private void buildingUI() {
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(235, 240, 245));

        JPanel header = new JPanel(new BorderLayout(10, 10));
        header.setBorder(new EmptyBorder(12, 16, 12, 16));
        header.setBackground(Color.WHITE);

        JLabel title = new JLabel("ECommerce");
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));

        JPanel searchArea = new JPanel(new BorderLayout(6, 6));
        tfSearch = new JTextField();
        tfSearch.setToolTipText("Search products...");
        JButton btnSearch = new JButton("Search");
        stylePrimary(btnSearch);
        searchArea.add(tfSearch, BorderLayout.CENTER);
        searchArea.add(btnSearch, BorderLayout.EAST);
        searchArea.setOpaque(false);

        JPanel cartArea = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        lblCartCount = new JLabel("Cart: 0 items");
        lblCartCount.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        cartArea.setOpaque(false);
        cartArea.add(lblCartCount);

        header.add(title, BorderLayout.WEST);
        header.add(searchArea, BorderLayout.CENTER);
        header.add(cartArea, BorderLayout.EAST);

        // Left: Category Tree
        categoryTree = buildCategoryTree();
        JScrollPane leftScroll = new JScrollPane(categoryTree);
        leftScroll.setPreferredSize(new Dimension(220, 0));
        TitledBorder leftBorder = BorderFactory.createTitledBorder("Categories");
        leftBorder.setTitleFont(new Font("Segoe UI", Font.BOLD, 14));
        leftScroll.setBorder(new CompoundBorder(new EmptyBorder(6, 10, 6, 6), leftBorder));

        // Center: Product Grid
        productGrid = new JPanel(new GridLayout(0, 2, 12, 12));
        productGrid.setBorder(new EmptyBorder(12, 6, 12, 6));
        productGrid.setBackground(new Color(235, 240, 245));
        JScrollPane centerScroll = new JScrollPane(productGrid);
        centerScroll.getVerticalScrollBar().setUnitIncrement(16);
        centerScroll.setBorder(new EmptyBorder(0, 0, 0, 0));

        // Right: Cart panel
        JPanel cartPanel = new JPanel(new BorderLayout(8, 8));
        cartPanel.setPreferredSize(new Dimension(320, 0));
        cartPanel.setBackground(Color.WHITE);
        cartPanel.setBorder(new CompoundBorder(
            new EmptyBorder(6, 6, 6, 10),
            BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(225, 230, 235)), "Your Cart")
        ));

        taCart = new JTextArea(14, 24);
        taCart.setEditable(false);
        taCart.setFont(new Font("Monospaced", Font.PLAIN, 13));
        taCart.setBackground(new Color(225, 245, 230));
        JScrollPane cartScroll = new JScrollPane(taCart);

        JPanel cartBottom = new JPanel(new GridBagLayout());
        cartBottom.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 1; gbc.fill = GridBagConstraints.HORIZONTAL;

        lblTotal = new JLabel("Total: ₹0.00");
        lblTotal.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblTotal.setForeground(new Color(0, 100, 0));

        JButton btnRemove = new JButton("Remove Last");
        styleBtn(btnRemove, new Color(231, 84, 128)); 
        JButton btnClear = new JButton("Clear Cart");
        styleBtn(btnClear, new Color(220, 38, 38));
        JButton btnCheckout = new JButton("Checkout");
        styleBtn(btnCheckout, new Color(34, 139, 34));

        cartBottom.add(lblTotal, gbc); gbc.gridy++;
        cartBottom.add(btnRemove, gbc); gbc.gridy++;
        cartBottom.add(btnClear, gbc); gbc.gridy++;
        cartBottom.add(btnCheckout, gbc);

        cartPanel.add(cartScroll, BorderLayout.CENTER);
        cartPanel.add(cartBottom, BorderLayout.SOUTH);

        // Layout add
        add(header, BorderLayout.NORTH);
        add(leftScroll, BorderLayout.WEST);
        add(centerScroll, BorderLayout.CENTER);
        add(cartPanel, BorderLayout.EAST);

        // ---------------- Events ----------------

        // Search
        btnSearch.addActionListener(e -> applySearch());
        tfSearch.addActionListener(e -> applySearch());

        // Category tree selection -> load products of subcategory or category
        categoryTree.addTreeSelectionListener(ev -> {
            TreePath path = categoryTree.getSelectionPath();
            if (path == null) return;
            Object nodeObj = ((DefaultMutableTreeNode) path.getLastPathComponent()).getUserObject();
            if (nodeObj instanceof SubCategory) {
                loadProducts(((SubCategory) nodeObj).prods);
            } else if (nodeObj instanceof Category) {
                // If category selected, aggregate and show all its products
                List<Productt> list = new ArrayList<>();
                for (SubCategory s : ((Category) nodeObj).subs) list.addAll(s.prods);
                loadProducts(list);
            }
        });

        // Cart buttons
        btnRemove.addActionListener(e -> {
            if (!cart.isEmpty()) {
                cart.remove(cart.size() - 1);
                refreshCart();
            }
        });

        btnClear.addActionListener(e -> {
            cart.clear();
            refreshCart();
        });

        btnCheckout.addActionListener(e -> checkoutBill());
    }

    private void applySearch() {
        String q = tfSearch.getText().trim().toLowerCase();
        if (q.isEmpty()) {
            loadAllProducts();
            return;
        }
        List<Productt> all = new ArrayList<>();
        for (Category c : catalog) for (SubCategory s : c.subs) all.addAll(s.prods);
        List<Productt> filtered = new ArrayList<>();
        for (Productt p : all) {
            if (p.name.toLowerCase().contains(q)
                || p.brand.toLowerCase().contains(q)
                || p.description.toLowerCase().contains(q)) {
                filtered.add(p);
            }
        }
        loadProducts(filtered);
    }

    // ---------------------------- Tree Builder ----------------------------

    private JTree buildCategoryTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("All Categories");
        for (Category c : catalog) {
            DefaultMutableTreeNode cNode = new DefaultMutableTreeNode(c);
            for (SubCategory s : c.subs) {
                DefaultMutableTreeNode sNode = new DefaultMutableTreeNode(s);
                cNode.add(sNode);
            }
            root.add(cNode);
        }
        JTree tree = new JTree(root);
        tree.setRootVisible(true);
        tree.setShowsRootHandles(true);
        tree.setBackground(new Color(200, 210, 220));
        tree.setCellRenderer(new DefaultTreeCellRenderer() {
            private final Color sel = new Color(210, 225, 255);
            private final Color norm = new Color(200, 210, 220);

            @Override
            public Component getTreeCellRendererComponent(
                    JTree tr, Object value, boolean selc, boolean exp, boolean leaf, int row, boolean hasFocus) {
                Component c = super.getTreeCellRendererComponent(tr, value, selc, exp, leaf, row, hasFocus);
                setBorder(new EmptyBorder(4, 6, 4, 6));
                if (selc) setBackgroundSelectionColor(sel); else setBackgroundNonSelectionColor(norm);
                setFont(new Font("Segoe UI", Font.PLAIN, 13));
                return c;
            }
        });
        for (int i = 0; i < tree.getRowCount(); i++) tree.expandRow(i);
        return tree;
    }

    // ---------------------------- Product Grid ----------------------------

    private void loadAllProducts() {
        List<Productt> all = new ArrayList<>();
        for (Category c : catalog) for (SubCategory s : c.subs) all.addAll(s.prods);
        loadProducts(all);
    }

    private void loadProducts(List<Productt> prods) {
        productGrid.removeAll();
        if (prods == null || prods.isEmpty()) {
            JLabel empty = new JLabel("No products found.", SwingConstants.CENTER);
            empty.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            JPanel wrap = new JPanel(new BorderLayout());
            wrap.setOpaque(false);
            wrap.add(empty, BorderLayout.CENTER);
            productGrid.add(wrap);
        } else {
            for (Productt p : prods) productGrid.add(new ProductCard(p));
        }
        productGrid.revalidate();
        productGrid.repaint();
    }

    private class ProductCard extends JPanel {
        Productt p;
        JSpinner qty;

        ProductCard(Productt p) {
            this.p = p;
            setLayout(new BorderLayout(8, 8));
            setBackground(Color.WHITE);
            setBorder(new CompoundBorder(new LineBorder(new Color(200, 210, 220), 1, true), new EmptyBorder(10, 12, 12, 12)));

            // Title area
            JLabel lblName = new JLabel(p.name);
            lblName.setFont(new Font("Segoe UI", Font.BOLD, 16));

            JLabel lblBrand = new JLabel("Brand: " + p.brand);
            JLabel lblRating = new JLabel("Rating: " + p.rating + " " + stars(p.rating));
            JLabel lblPrice = new JLabel("₹" + String.format("%.2f", p.price));
            lblPrice.setFont(new Font("Segoe UI", Font.BOLD, 16));
            lblPrice.setForeground(new Color(0, 100, 0));

            JTextArea desc = new JTextArea(p.description);
            desc.setEditable(false);
            desc.setLineWrap(true);
            desc.setWrapStyleWord(true);
            desc.setBackground(new Color(250, 253, 250));
            desc.setFont(new Font("Segoe UI", Font.PLAIN, 12));

            JPanel top = new JPanel(new BorderLayout());
            top.setOpaque(false);
            top.add(lblName, BorderLayout.NORTH);

            JPanel info = new JPanel(new GridLayout(3, 1));
            info.setOpaque(false);
            info.add(lblBrand);
            info.add(lblRating);
            info.add(lblPrice);

            top.add(info, BorderLayout.CENTER);

            // Bottom controls
            JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 0));
            bottom.setOpaque(false);
            qty = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
            JButton btnAdd = new JButton("Add to Cart");
            styleSuccess(btnAdd);
            btnAdd.addActionListener(e -> addToCart(p, (int) qty.getValue()));
            bottom.add(new JLabel("Qty:"));
            bottom.add(qty);
            bottom.add(btnAdd);

            add(top, BorderLayout.NORTH);
            add(new JScrollPane(desc), BorderLayout.CENTER);
            add(bottom, BorderLayout.SOUTH);
        }
    }

    private String stars(double rating) {
        int full = (int) Math.round(rating); // simple approximation 0..5
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) sb.append(i < full ? '★' : '☆');
        return sb.toString();
    }

    // ---------------------------- Cart Logic ----------------------------

    private void addToCart(Productt p, int q) {
        boolean found = false;
        for (Productt cp : cart) {
            if (cp.name.equals(p.name) && cp.brand.equals(p.brand)) {
                cp.quantity += q;
                found = true;
                break;
            }
        }
        if (!found) {
            Productt gp = new Productt(p.name, p.brand, p.price, p.rating, p.description);
            gp.quantity = q;
            cart.add(gp);
        }
        refreshCart();
    }

    private void refreshCart() {
        taCart.setText("");
        double tot = 0;
        int idx = 1;
        int itemCount = 0;
        for (Productt p : cart) {
            double sub = p.price * p.quantity;
            taCart.append(String.format("%2d. %-22s ×%d  ₹%.2f%n", idx++, p.name, p.quantity, sub));
            tot += sub;
            itemCount += p.quantity;
        }
        lblTotal.setText("Total: ₹" + String.format("%.2f", tot));
        lblCartCount.setText("Cart: " + itemCount + (itemCount == 1 ? " item" : " items"));
    }

    private void checkoutBill() {
        if (cart.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Cart is empty.");
            return;
        }
        StringBuilder bill = new StringBuilder("FINAL BILL\n---------------------------\n");
        double tot = 0;
        int idx = 1;
        for (Productt p : cart) {
            double sub = p.price * p.quantity;
            bill.append(String.format("%d. %-20s %2d × ₹%.2f = ₹%.2f%n", idx++, p.name, p.quantity, p.price, sub));
            tot += sub;
        }
        bill.append("---------------------------\nTOTAL = ₹").append(String.format("%.2f", tot));

        JTextArea ba = new JTextArea(bill.toString());
        ba.setFont(new Font("Monospaced", Font.PLAIN, 12));
        ba.setEditable(false);

        JOptionPane.showMessageDialog(this, new JScrollPane(ba), "Invoice", JOptionPane.PLAIN_MESSAGE);
    }

    // ---------------------------- Button Styles ----------------------------

    private void stylePrimary(AbstractButton b) { styleBtn(b, new Color(20, 100, 220)); }
    private void styleSuccess(AbstractButton b) { styleBtn(b, new Color(30, 180, 70)); }
    private void styleWarning(AbstractButton b) { styleBtn(b, new Color(240, 130, 30)); }
    private void styleDanger(AbstractButton b) { styleBtn(b, new Color(220, 50, 40)); }

    private void styleBtn(AbstractButton b, Color base) {
        b.setFocusPainted(false);
        b.setForeground(Color.WHITE);
        b.setBackground(base);
        b.setBorder(new EmptyBorder(8, 14, 8, 14));
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.addMouseListener(new MouseAdapter() {
            @Override 
            public void mouseEntered(MouseEvent e) { 
            	b.setBackground(base.darker()); 
            	}
            @Override 
            public void mouseExited(MouseEvent e) {
            	b.setBackground(base); 
            	}
        });
    }

    // ---------------------------- Main ----------------------------
    public static void main(String[] args) {
        // Make all Swing texts black (note: we style buttons ourselves)
        UIManager.put("Label.foreground", Color.BLACK);
        UIManager.put("Button.foreground", Color.BLACK);
        UIManager.put("TextField.foreground", Color.BLACK);
        UIManager.put("TextArea.foreground", Color.BLACK);
        UIManager.put("Tree.textForeground", Color.BLACK);
        UIManager.put("Table.foreground", Color.BLACK);

        SwingUtilities.invokeLater(() -> new Ecommerce().setVisible(true));
    }
}